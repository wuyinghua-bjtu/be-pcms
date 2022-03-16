package com.bepcms.pcms.Controller.InfoController;

import com.bepcms.pcms.Entity.CourseInfo;
import com.bepcms.pcms.Service.CourseInfoService;
import com.bepcms.pcms.model.dto.ResultDto;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class StatisticsController {

    @Resource
    private CourseInfoService courseInfoService;

    @PostMapping("/course/info/get/list")
    @ResponseBody
    public ResultDto consoleQueryList(@RequestBody Map map) {
        List<CourseInfo> courseInfoList = null;
        PageHelper.startPage(Integer.parseInt(map.get("pageNum").toString()), Integer.parseInt(map.get("pageSize").toString()));
        courseInfoList = this.courseInfoService.getCourseInfoByCondition(map);
        if (courseInfoList != null && courseInfoList.size() > 0) {
            Map module = new HashMap();
            module.put("list", courseInfoList);
            module.put("total", this.courseInfoService.getCount(map));
            return new ResultDto().ok(module);
        } else {
            return new ResultDto().error("未查询到课程");
        }
    }

}
