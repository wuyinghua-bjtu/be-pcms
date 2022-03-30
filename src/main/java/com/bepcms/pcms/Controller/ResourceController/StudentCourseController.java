package com.bepcms.pcms.Controller.ResourceController;


import com.bepcms.pcms.Entity.CourseInfo;
import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Service.CourseInfoService;
import com.bepcms.pcms.Service.StudentCourceService;
import com.bepcms.pcms.model.dto.ResultDto;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class StudentCourseController {

    @Resource
    private StudentCourceService studentCourceService;

    @Resource
    private CourseInfoService courseInfoService;

    @PostMapping("/course/resource/get/list")
    @ResponseBody
    public ResultDto consoleQueryList(@RequestBody Map map, HttpServletRequest request) {
        List<CourseInfo> courseInfoList = null;
        PageHelper.startPage(Integer.parseInt(map.get("pageNum").toString()), Integer.parseInt(map.get("pageSize").toString()));
        courseInfoList = this.studentCourceService.getStudentCourceByCondition(map, request);
//        courseInfoList = this.courseInfoService.getCourseInfoByCondition(map);
        if (courseInfoList != null && courseInfoList.size() > 0) {
            Map module = new HashMap();
            module.put("list", courseInfoList);
            module.put("total", this.studentCourceService.getCount(map));
            return new ResultDto().ok(module);
        } else {
            return new ResultDto().error("未查询到用户");
        }
    }

}
