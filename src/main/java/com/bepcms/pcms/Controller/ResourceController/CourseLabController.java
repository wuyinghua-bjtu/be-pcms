package com.bepcms.pcms.Controller.ResourceController;


import com.bepcms.pcms.Entity.CourseLab;
import com.bepcms.pcms.Service.CourseLabService;
import com.bepcms.pcms.model.dto.ResultDto;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CourseLabController {

    @Resource
    private CourseLabService courseLabService;


    @PostMapping("/course/resource/get/lab/list")
    @ResponseBody
    public ResultDto consoleQueryLab(@RequestBody Map map) {

        PageHelper.startPage(Integer.parseInt(map.get("pageNum").toString()), Integer.parseInt(map.get("pageSize").toString()));
        List<CourseLab> list = this.courseLabService.getCourseLabByCondition(map);

        if (list != null && list.size() > 0) {
            Map module = new HashMap();
            module.put("list", list);
            module.put("total", this.courseLabService.getCount(map));
            return new ResultDto().ok(module);
        } else {
            return new ResultDto<>().error("未查询到实验");
        }

    }

    @PostMapping("course/resource/addLab")
    @ResponseBody
    public ResultDto consoleAddLab(@RequestBody Map map) {

        if (addLab(map)) {
            return new ResultDto<>().ok(null);
        } else {
            return new ResultDto<>().error("添加失败");
        }

    }

    private boolean addLab(Map map) {

        CourseLab record = new CourseLab();

        record.setInfoid(Integer.parseInt(map.get("infoId").toString()));
        record.setLabname(map.get("labName").toString());
        record.setLabstyle(map.get("labStyle").toString());
        record.setLabenv(map.get("labEnv").toString());
        record.setHasgroup(map.get("duration").toString());
        record.setLabtype(map.get("labType").toString());
        record.setAim(map.get("aim").toString());
        record.setPrinciple(map.get("principle").toString());
        record.setGuide(map.get("guide").toString());
        record.setNotice(map.get("notice").toString());
        record.setHasfile(map.get("hasFile") == "true");
        record.setFiletag(map.get("fileTag").toString());

        return this.courseLabService.addCourseLab(record);

    }

}
