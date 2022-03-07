package com.bepcms.pcms.Controller;


import com.bepcms.pcms.Entity.StudentAccount;
import com.bepcms.pcms.Service.StudentAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentAccountController {

    @Resource
    private StudentAccountService studentAccountService;


    @RequestMapping("/showUser")
    @ResponseBody
    public StudentAccount toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("userId"));
        return this.studentAccountService.getStudentAccountByUserId(userId);
    }

}
