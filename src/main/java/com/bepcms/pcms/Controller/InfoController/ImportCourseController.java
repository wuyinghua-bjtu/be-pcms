package com.bepcms.pcms.Controller.InfoController;

import com.alibaba.excel.EasyExcel;
import com.bepcms.pcms.Entity.CourseInfo;
import com.bepcms.pcms.Entity.StudentList;
import com.bepcms.pcms.Service.CourseInfoService;
import com.bepcms.pcms.Service.impl.ModelExcelListener;
import com.bepcms.pcms.model.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class ImportCourseController {

    private List<CourseInfo> submitList;

    @Resource
    private CourseInfoService courseInfoService;

    @PostMapping("/course/info/import")
    @ResponseBody
    public ResultDto consoleImportCourse(@RequestBody Map map) {
        if (addCourseInfo(map)) {
            return new ResultDto().ok(null);
        } else {
            return new ResultDto().error("添加课程失败！");
        }
    }

    @PostMapping("/course/info/uploadCourse")
    @ResponseBody
    public ResultDto consoleUploadCourse(@RequestParam MultipartFile file) {
        this.submitList = uploadCourse(file);
        if (this.submitList.size() >= 0) {
            Map module = new HashMap();
            module.put("list", this.submitList);
            module.put("total", this.submitList.size());
            return new ResultDto().ok(module);
        } else {
            return new ResultDto().error("上传失败");
        }
    }

    @PostMapping("/course/info/upload/submit")
    @ResponseBody
    public ResultDto submitUploadAddCourse() {
        try {
            for (CourseInfo item : this.submitList) {
                CourseInfo record = new CourseInfo();
                record.setCourseid(item.getCourseid());
                record.setCoursename(item.getCoursename());
                record.setPeriod(item.getPeriod());
                record.setCredits(item.getCredits());
                record.setLabperiod(item.getLabperiod());
                record.setCollege(item.getCollege());
                record.setTeacherid(item.getTeacherid());
                record.setTeachername(item.getTeachername());
                record.setLabtype(item.getLabtype());
                record.setGrade(item.getGrade());
                record.setMajor(item.getMajor());
                record.setIsnecessary(item.getIsnecessary());
                record.setLabtimes(item.getLabtimes());
                record.setLabnum(item.getLabnum());
                record.setTerm(item.getTerm());
                record.setStudentnum(item.getStudentnum());
                record.setGroupmatenum(item.getGroupmatenum());
                record.setLaboratoryname(item.getLaboratoryname());
                record.setExperimenternum(item.getExperimenternum());
                record.setAddress(item.getAddress());
                this.courseInfoService.addCourse(record);
            }
            return new ResultDto().ok(null);
        } catch (Exception e) {
            return new ResultDto().error(e.toString());
        }
    }

    private List<CourseInfo> uploadCourse(MultipartFile file) {
        List<CourseInfo> lists = new ArrayList<>();
        try {
            lists = EasyExcel.read(file.getInputStream(), CourseInfo.class, new ModelExcelListener()).sheet().doReadSync();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lists;
    }

    private boolean addCourseInfo(Map map) {
        CourseInfo record = new CourseInfo();
        record.setCourseid(map.get("courseId").toString());
        record.setCoursename(map.get("courseName").toString());
        record.setPeriod(Integer.parseInt(map.get("period").toString()));
        record.setCredits(Integer.parseInt(map.get("credits").toString()));
        record.setLabperiod(Integer.parseInt(map.get("labPeriod").toString()));
        record.setCollege(map.get("college").toString());
        record.setTeacherid(map.get("teacherId").toString());
        record.setTeachername(map.get("teacherName").toString());
        record.setLabtype(map.get("labType").toString());
        record.setGrade(map.get("grade").toString());
        record.setMajor(map.get("major").toString());
        record.setIsnecessary(map.get("isNecessary").toString());
        record.setLabtimes(Integer.parseInt(map.get("labTimes").toString()));
        record.setLabnum(Integer.parseInt(map.get("labNum").toString()));
        record.setTerm(Integer.parseInt(map.get("term").toString()));
        record.setStudentnum(Integer.parseInt(map.get("studentNum").toString()));
        record.setGroupmatenum(Integer.parseInt(map.get("groupmateNum").toString()));
        record.setLaboratoryname(map.get("laboratoryName").toString());
        record.setExperimenternum(Integer.parseInt(map.get("experimenterNum").toString()));
        record.setAddress(map.get("address").toString());
        return this.courseInfoService.addCourse(record);
    }

}
