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

    @PostMapping("/admin/addCourse")
    @ResponseBody
    public ResultDto consoleAddCourse(@RequestBody Map map) {
        log.info("添加课程");
        if (addCourseList(map)) {
            return new ResultDto().ok(null);
        } else {
            return new ResultDto().error("添加失败");
        }
    }

    @PostMapping("/admin/deleteCourse")
    @ResponseBody
    public ResultDto consoleDeleteCourse(@RequestBody Map map) {
        if (this.coureseListService.deleteCourse(map.get("id").toString())) {
            return new ResultDto().ok(null);
        } else {
            return new ResultDto().error("删除失败");
        }
    }

//    添加课程
    private boolean addCourseList(Map map) {
        CourseList record = new CourseList();

        record.setCourseid(map.get("id").toString());
        record.setCoursename(map.get("name").toString());
        record.setCollege(map.get("college").toString());
        record.setCredits(Integer.parseInt(map.get("credits").toString()));
        record.setPeriod(Integer.parseInt(map.get("period").toString()));
        record.setMajor(map.get("major").toString());

        return this.coureseListService.addCourse(record);
    }


}
