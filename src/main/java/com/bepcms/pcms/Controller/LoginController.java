package com.bepcms.pcms.Controller;

import com.bepcms.pcms.Entity.AccountInfo;
import com.bepcms.pcms.Entity.StudentAccount;
import com.bepcms.pcms.Service.AccountInfoService;
import com.bepcms.pcms.Service.StudentAccountService;
import com.bepcms.pcms.model.LoginParam;
import com.bepcms.pcms.model.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@Slf4j
public class LoginController {

    @Resource
    private AccountInfoService accountInfoService;

    @Resource
    private StudentAccountService studentAccountService;

    @PostMapping("/login")
    @ResponseBody
    public ResultDto consoleLogin(@RequestBody LoginParam loginParam, HttpServletRequest request, HttpServletResponse response) {

        AccountInfo accountInfo = null;
        StudentAccount studentAccount = studentAccountService.getStudentAccountByUserId(Integer.parseInt(loginParam.getUsername()));
        if (studentAccount != null) {
            if (studentAccount.getPassword().equals(loginParam.getPassword())) {
                HttpSession session = request.getSession();
                session.setAttribute("userId", loginParam.getUsername());

//                Cookie cookie = new Cookie("userId", loginParam.getUsername());
//                cookie.setMaxAge(30*60);
//                cookie.setPath("/");
//                response.addCookie(new Cookie("userId", loginParam.getUsername()));
                return new ResultDto<>().ok(null);
//                accountInfo = accountInfoService.getAccountInfoByUserId(Integer.parseInt(loginParam.getUsername()));
//                if (accountInfo != null)
//                    return new ResultDto().ok(accountInfo);
//                else
//                    return new ResultDto<>().error("未查询到用户信息");
            } else {
                return new ResultDto().error("用户名或密码错误");
            }
        } else {
            return new ResultDto<>().error("未查询到用户");
        }

    }

    @PostMapping("/logout")
    @ResponseBody
    public ResultDto consoleLogout(HttpServletRequest request, HttpServletResponse response) {

        try {
            HttpSession session = request.getSession();
            session.invalidate();
            return new ResultDto<>().ok(null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDto<>().error("登出失败");
        }



    }



}
