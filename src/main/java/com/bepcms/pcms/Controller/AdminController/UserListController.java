package com.bepcms.pcms.Controller.AdminController;

import com.bepcms.pcms.Entity.AdminList;
import com.bepcms.pcms.Entity.StudentList;
import com.bepcms.pcms.Entity.StudentListExample;
import com.bepcms.pcms.Entity.UserList;
import com.bepcms.pcms.Service.AdminListService;
import com.bepcms.pcms.Service.StudentListService;
import com.bepcms.pcms.model.dto.ResultDto;
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
public class UserListController<T extends UserList> {

    @Resource
    private StudentListService studentListService;

    @Resource
    private AdminListService adminListService;

    @PostMapping("/admin/user/list")
    @ResponseBody
    public ResultDto consoleQueryList(@RequestBody Map map, HttpServletRequest request, HttpServletResponse response) {
        log.info(map.get("type").toString());
        ResultDto res = new ResultDto();
        List<StudentList> studentLists = null;
        List<AdminList> adminLists = null;
        List<T> lists = null;
        if (map.get("type").toString().equals("student")) {
            log.info("调用查询学生列表接口");
            studentLists =  queryStudentList(map, request, response);
        }
        else if (map.get("type").toString().equals("admin")) {
            adminLists = queryAdminList(map, request, response);
        }
        if (studentLists.size() > 0) {
            Map module = new HashMap();
            module.put("list", studentLists);
            module.put("total", studentLists.size());
            return new ResultDto().ok(module);
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
}
