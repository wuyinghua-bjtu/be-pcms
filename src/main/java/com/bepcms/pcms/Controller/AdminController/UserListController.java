package com.bepcms.pcms.Controller.AdminController;

import com.bepcms.pcms.Entity.StudentList;
import com.bepcms.pcms.Service.StudentListService;
import com.bepcms.pcms.model.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class UserListController {

    @Resource
    private StudentListService studentListService;


    @PostMapping("/admin/user/list")
    @ResponseBody
    public ResultDto consoleQueryList(@RequestBody Map map, HttpServletRequest request, HttpServletResponse response) {
        log.info(map.get("type").toString());
        ResultDto res = new ResultDto();
        List<StudentList> studentLists = null;
        if (map.get("type").toString().equals("student")) {
            log.info("调用查询学生列表接口");
            studentLists =  queryStudentList(map, request, response);
        }
        if (studentLists.size() > 0) {
            return new ResultDto().ok(studentLists);
        }
        return res;
    }

//    查询学生列表函数
    public List<StudentList> queryStudentList(Map map, HttpServletRequest request, HttpServletResponse response) {
        String sql = "";
        if (map.get("userId") == null) {
            sql = "*";
        } else {
            sql = map.get("userId").toString();
        }
//        return this.studentListService.getStudentListByPrimartKey(sql);
//        return new StudentList();
        return this.studentListService.getStudentListAll();
    }
}
