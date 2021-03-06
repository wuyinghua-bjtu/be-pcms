package com.bepcms.pcms.Controller.AdminController;


import com.alibaba.excel.EasyExcel;
import com.bepcms.pcms.Entity.AdminList;
import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Entity.StudentList;
import com.bepcms.pcms.Entity.TeacherList;
import com.bepcms.pcms.Service.*;
import com.bepcms.pcms.Service.impl.ModelExcelListener;
import com.bepcms.pcms.model.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class UploadFileController {

    @Resource
    private CoureseListService coureseListService;

    @Resource
    private StudentListService studentListService;

    @Resource
    private AdminListService adminListService;

    @Resource
    private TeacherListService teacherListService;

    @Resource
    UploadFileService uploadFileService;

    @PostMapping("/admin/upload/file")
    @ResponseBody
    public ResultDto consoleUploadFile(@RequestParam("file") MultipartFile file, @RequestParam("type") String type) {
        log.info(type);
        if (type.equals("student")) {
            return uploadStudentList(file);
        } else if (type.equals("teacher")) {
            return uploadTeacherList(file);
        } else if (type.equals("admin")) {
            return uploadAdminList(file);
        } else if (type.equals("course")) {
          return uploadCourseList(file);
        } else {
            return new ResultDto().error("传参有误");
        }

    }

//    导入学生信息
    private ResultDto uploadStudentList(MultipartFile file) {

        List<StudentList> lists = new ArrayList<>();
        try {
            lists = EasyExcel.read(file.getInputStream(), StudentList.class, new ModelExcelListener()).sheet().doReadSync();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (StudentList item : lists) {
                StudentList record = new StudentList();
                record.setStudentid(item.getStudentid());
                record.setStudentname(item.getStudentname());
                record.setStudentage(item.getStudentage());
                record.setStudentsex(item.getStudentsex());
                record.setCollege(item.getCollege());
                record.setMajor(item.getMajor());
                this.studentListService.addStudent(record);
            }
            return new ResultDto().ok(null);
        } catch (Exception e) {
            return new ResultDto().error(e.toString());
        }

    }

//    导入教师信息
    private ResultDto uploadTeacherList(MultipartFile file) {
        List<TeacherList> lists = new ArrayList<>();
        try {
            lists = EasyExcel.read(file.getInputStream(), TeacherList.class, new ModelExcelListener()).sheet().doReadSync();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (TeacherList item : lists) {
                TeacherList record = new TeacherList();
                record.setTeacherid(item.getTeacherid());
                record.setTeachername(item.getTeachername());
                record.setTeacherage(item.getTeacherage());
                record.setTeachersex(item.getTeachersex());
                this.teacherListService.addTeacher(record);
            }
            return new ResultDto().ok(null);
        } catch (Exception e) {
            return new ResultDto().error("导入失败");
        }
    }

//    导入管理员信息
    private ResultDto uploadAdminList(MultipartFile file) {
        List<AdminList> lists = new ArrayList<>();
        try {
            lists = EasyExcel.read(file.getInputStream(), AdminList.class, new ModelExcelListener()).sheet().doReadSync();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (AdminList item : lists) {
                AdminList record = new AdminList();
                record.setAdminid(item.getAdminid());
                record.setAdminname(item.getAdminname());
                this.adminListService.addAdmin(record);
            }
            return new ResultDto().ok(null);
        } catch (Exception e) {
            return new ResultDto().error("导入失败");
        }
    }

//    导入课程信息
    private ResultDto uploadCourseList(MultipartFile file) {
        List<CourseList> lists = new ArrayList<>();
        try {
            lists = EasyExcel.read(file.getInputStream(), CourseList.class, new ModelExcelListener()).sheet().doReadSync();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (CourseList item : lists) {
                CourseList record = new CourseList();
                record.setCourseid(item.getCourseid());
                record.setCoursename(item.getCoursename());
                record.setCredits(item.getCredits());
                record.setPeriod(item.getPeriod());
                record.setCollege(item.getCollege());
                record.setMajor(item.getMajor());
                this.coureseListService.addCourse(record);
            }
            return new ResultDto().ok(null);
        } catch (Exception e) {
            return new ResultDto().error("导入失败");
        }
    }
}
