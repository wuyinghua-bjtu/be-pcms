package com.bepcms.pcms.Controller.AdminController;


import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Service.CoureseListService;
import com.bepcms.pcms.model.dto.ResultDto;
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
public class CourseListController {

    @Resource
    private CoureseListService coureseListService;

    @PostMapping("/admin/course/list")
    @ResponseBody
    public ResultDto consoleQueryList(@RequestBody Map map) {
        ResultDto res = new ResultDto();
        List<CourseList> courseListList = null;
        courseListList = this.coureseListService.getCourseListByCondition(map);
        if (courseListList != null && courseListList.size() > 0) {
            Map module = new HashMap();
            module.put("list", courseListList);
            module.put("total", courseListList.size());
            return new ResultDto().ok(module);
        } else {
            return new ResultDto().error("未查询到用户");
        }
    }

}
