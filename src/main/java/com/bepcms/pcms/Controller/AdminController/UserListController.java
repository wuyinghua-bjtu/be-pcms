package com.bepcms.pcms.Controller.AdminController;

import com.bepcms.pcms.Entity.*;
import com.bepcms.pcms.Service.AdminListService;
import com.bepcms.pcms.Service.StudentListService;
import com.bepcms.pcms.Service.TeacherListService;
import com.bepcms.pcms.model.dto.ResultDto;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class UserListController<T> {

    @Resource
    private StudentListService studentListService;

    @Resource
    private AdminListService adminListService;

    @Resource
    private TeacherListService teacherListService;

    @PostMapping("/admin/user/list")
    @ResponseBody
    public ResultDto consoleQueryList(@RequestBody Map map, HttpServletRequest request, HttpServletResponse response) {
        log.info(map.get("type").toString());
        ResultDto res = new ResultDto();
        List<T> lists = null;
        int total = 0;
        PageHelper.startPage(Integer.parseInt(map.get("pageNum").toString()), Integer.parseInt(map.get("pageSize").toString()));
        if (map.get("type").toString().equals("student")) {
            log.info("调用查询学生列表接口");
            lists = (List<T>) queryStudentList(map, request, response);
            total = this.studentListService.getCount(map);
        }
        else if (map.get("type").toString().equals("admin")) {
            lists = (List<T>) queryAdminList(map, request, response);
            total = this.adminListService.getCount(map);
        }
        else if (map.get("type").toString().equals("teacher")) {
            lists = (List<T>) queryTeacherList(map, request, response);
            total = this.teacherListService.getCount(map);
        }
        if (lists != null) {
            if (lists.size() > 0) {
                Map module = new HashMap();
                module.put("list", lists);
                module.put("total", total);
                return new ResultDto().ok(module);
            } else {
                return new ResultDto().error("未查询到用户");
            }
        }
        return res;
    }

    @PostMapping("/admin/addUser")
    @ResponseBody
    public ResultDto consoleAddList(@RequestBody Map map, HttpServletRequest request, HttpServletResponse response) {
        ResultDto res = new ResultDto();
        if (map.get("type").toString().equals("student")) {
            if (addStudentList(map, request, response)) {
                return new ResultDto().ok(null);
            }
        } else if (map.get("type").toString().equals("admin")) {
            if (addAdminList(map, request, response)) {
                return new ResultDto().ok(null);
            }
        } else if (map.get("type").toString().equals("teacher")) {
            if (addTeacherList(map, request, response)) {
                return new ResultDto().ok(null);
            }
        }
        return res;
    }

    @PostMapping("/admin/deleteUser")
    @ResponseBody
    public ResultDto consoleDeleteUser(@RequestBody Map map) {
        ResultDto res = new ResultDto();
        if (map.get("type").toString().equals("student")) {
            if (deleteStudentList(map)) {
                return new ResultDto().ok(null);
            }
        } else if (map.get("type").toString().equals("admin")) {
            if (deleteAdminList(map)) {
                return new ResultDto().ok(null);
            }
        } else if (map.get("type").toString().equals("teacher")) {
            if (deleteTeacherList(map)) {
                return new ResultDto().ok(null);
            }
        }
        return res;
    }

//    查询学生列表
    public List<StudentList> queryStudentList(Map map, HttpServletRequest request, HttpServletResponse response) {
        return this.studentListService.getStudentListByCondition(map);
    }

//    查询管理员列表
    public List<AdminList> queryAdminList(Map map, HttpServletRequest request, HttpServletResponse response) {
        return this.adminListService.getAdminListByCondition(map);
    }

//    查询教师列表
    public List<TeacherList> queryTeacherList(Map map, HttpServletRequest request, HttpServletResponse response) {
        return this.teacherListService.getTeacherListByCondition(map);
    }

//    添加学生用户
    public boolean addStudentList(Map map, HttpServletRequest request, HttpServletResponse response) {
        StudentList record = new StudentList();
        record.setStudentid(map.get("id").toString());
        record.setStudentname(map.get("name").toString());
        record.setStudentsex(map.get("age").toString());
        record.setStudentage(Integer.parseInt(map.get("age").toString()));
        record.setCollege(map.get("college").toString());
        record.setMajor(map.get("major").toString());
        return this.studentListService.addStudent(record);
    }

//    添加管理员用户
    public boolean addAdminList(Map map, HttpServletRequest request, HttpServletResponse response) {
        AdminList record = new AdminList();
        record.setAdminid(map.get("id").toString());
        record.setAdminname(map.get("name").toString());
        return this.adminListService.addAdmin(record);
    }

//    添加教师
    public boolean addTeacherList(Map map, HttpServletRequest request, HttpServletResponse response) {
        TeacherList record = new TeacherList();
        record.setTeacherid(map.get("id").toString());
        record.setTeachername(map.get("name").toString());
        record.setTeachersex(map.get("age").toString());
        record.setTeacherage(Integer.parseInt(map.get("age").toString()));
        return this.teacherListService.addTeacher(record);
    }

//    删除学生用户
    public boolean deleteStudentList(Map map) {
        return this.studentListService.deleteStudent(map.get("id").toString());
    }

//  删除管理员用户
    public boolean deleteAdminList(Map map) {
        return this.adminListService.deleteAdmin(map.get("id").toString());
    }

//  删除教师用户
    public boolean deleteTeacherList(Map map) {
        return this.teacherListService.deleteTeacher(map.get("id").toString());
    }
}
