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
import org.apache.commons.io.FilenameUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public final static String IMG_PATH_PREFIX = "static/upload";

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

    @PostMapping("/course/info/lab/uploadFile")
    @ResponseBody
    public ResultDto labUploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws IOException {

        if(file.isEmpty()){
            return new ResultDto().error("文件为空");
        }
//        //如下随便尝试几种获取module运行目录的几种方式
//        //直接取相对目录的话，获取到的是project中新建的第一个module中的路径
//        String directRelativePath = new String("src/main/resources" + File.separator + IMG_PATH_PREFIX);
//        File directRelativeDir = new File(directRelativePath);
//        System.out.println("直接写相对目录获取的路径, src/main/resources/static/upload: " + directRelativeDir.getAbsolutePath());
//
//        //通过System.getProperty("user.dir")获取module路径
//        String userDirPath = System.getProperty("user.dir");
//        File userDirDir = new File(userDirPath + File.separator + IMG_PATH_PREFIX);
//        System.out.println("通过系统属性user.dir获取的路径, System.getProperty(\"user.dir\") + /static/upload: "+userDirDir.getAbsolutePath());

//        //request.getServletContext().getRealPath("/")获取运行时的路径
//        String requestServletContextPath = request.getServletContext().getRealPath("/");
//        File requestServletContextDir = new File(requestServletContextPath + File.separator + IMG_PATH_PREFIX);
//        System.out.println("通过ServletContext获取的路径, request.getServletContext().getRealPath(\"/\") + /static/upload: "+requestServletContextDir.getAbsolutePath());


//        这里将文件放在resources目录的static/upload子目录下，通过ClassPathResource的方式先拿到application.properties文件的路径。
//        然后，取父目录得到resources目录。
//        先通过ClassPathResource获取application.properties的路径
        ClassPathResource applicationProperties = new ClassPathResource("application.properties");
        //然后通过取其父目录获得resources目录，设置上传文件的目录
        String uploadFileSavePath = applicationProperties.getFile().getParentFile().getAbsolutePath() + File.separator + "static/upload";
        File uploadFileSaveDir = new File(uploadFileSavePath);
        log.info("上传文件的存放目录：{}", uploadFileSaveDir.getAbsolutePath());
        if(!uploadFileSaveDir.exists()){
            // 递归生成文件夹
            uploadFileSaveDir.mkdirs();
        }

        // 拿到文件名
        String filename = file.getOriginalFilename();
        // 构建真实的文件路径
        File uploadFile = new File(uploadFileSaveDir.getAbsolutePath() + File.separator + filename);
        System.out.println("文件上传到：" + uploadFile.getAbsolutePath());
        //文件写到服务器，
        file.transferTo(uploadFile);
        response.setStatus(200);
        return new ResultDto().ok(null);
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
