package com.bepcms.pcms.Controller;

import com.bepcms.pcms.Entity.AccountInfo;
import com.bepcms.pcms.Entity.AdminAccount;
import com.bepcms.pcms.Entity.StudentAccount;
import com.bepcms.pcms.Entity.TeacherAccount;
import com.bepcms.pcms.Service.AccountInfoService;
import com.bepcms.pcms.Service.AdminAccountService;
import com.bepcms.pcms.Service.StudentAccountService;
import com.bepcms.pcms.Service.TeacherAccountService;
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
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class LoginController {

    @Resource
    private AccountInfoService accountInfoService;

    @Resource
    private StudentAccountService studentAccountService;

    @Resource
    private TeacherAccountService teacherAccountService;

    @Resource
    private AdminAccountService adminAccountService;

    @PostMapping("/login")
    @ResponseBody
    public ResultDto consoleLogin(@RequestBody LoginParam loginParam, HttpServletRequest request, HttpServletResponse response) {

        String loginType = loginParam.getLoginType();
        if (loginType.equals("student")) {
            return studentLogin(loginParam, request);
        } else if (loginType.equals("teacher")) {
            return teacherLogin(loginParam, request);
        } else {
            return adminLogin(loginParam, request);
        }

    }

    @PostMapping("/logout")
    @ResponseBody
    public ResultDto consoleLogout(HttpServletRequest request, HttpServletResponse response) {

        try {
            HttpSession session = request.getSession();
            String userId = (String) session.getAttribute("userId");
            AccountInfo accountInfo = this.accountInfoService.getAccountInfoByUserId(Integer.parseInt(userId));
            Map map = new HashMap();
            map.put("userId", Integer.parseInt(userId));
            map.put("username", accountInfo.getUsername());
            map.put("userTypeCode", accountInfo.getUsertypecode());
            map.put("loginTime", accountInfo.getLogintime());
            map.put("totalTime", (long) (new Date().getTime() - accountInfo.getLogintime().getTime())/(1000 * 60) + Long.parseLong(accountInfo.getTotaltime().toString()));
            log.info("登出时间：{}", new Date().toString());
            log.info("总时长：{}", (long) (new Date().getTime() - accountInfo.getLogintime().getTime())/(1000 * 60) + Long.parseLong(accountInfo.getTotaltime().toString()));
            accountInfoService.updateAccountInfo(map);
            session.invalidate();

            return new ResultDto<>().ok(null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDto<>().error("登出失败");
        }
    }

    private ResultDto studentLogin(LoginParam loginParam, HttpServletRequest request) {

        log.info("{}", loginParam);
        StudentAccount studentAccount = studentAccountService.getStudentAccountByUserId(Integer.parseInt(loginParam.getUserId()));
        if (studentAccount != null) {
            if (studentAccount.getPassword().equals(loginParam.getPassword())) {
                return updateAccountInfo(loginParam, request);
            } else {
                return new ResultDto().error("用户名或密码错误");
            }
        } else {
            return new ResultDto<>().error("未查询到用户");
        }

    }

    private ResultDto teacherLogin(LoginParam loginParam, HttpServletRequest request) {

        TeacherAccount teacherAccount = teacherAccountService.getTeacherAccountByUserId(Integer.parseInt(loginParam.getUserId()));
        if (teacherAccount != null) {
            if (teacherAccount.getPassword().equals(loginParam.getPassword())) {
                return updateAccountInfo(loginParam, request);
            } else {
                return new ResultDto().error("用户名或密码错误");
            }
        } else {
            return new ResultDto<>().error("未查询到用户");
        }

    }

    private ResultDto adminLogin(LoginParam loginParam, HttpServletRequest request) {

        AdminAccount adminAccount = adminAccountService.getAdminAccountByUserId(Integer.parseInt(loginParam.getUserId()));
        if (adminAccount != null) {
            if (adminAccount.getPassword().equals(loginParam.getPassword())) {
                return updateAccountInfo(loginParam, request);
            } else {
                return new ResultDto().error("用户名或密码错误");
            }
        } else {
            return new ResultDto<>().error("未查询到用户");
        }

    }

    private ResultDto updateAccountInfo(LoginParam loginParam, HttpServletRequest request) {

        try {
            AccountInfo accountInfo = null;
            HttpSession session = request.getSession();
            session.setAttribute("userId", loginParam.getUserId());
            accountInfo = this.accountInfoService.getAccountInfoByUserId(Integer.parseInt(loginParam.getUserId()));
            Map map = new HashMap();
            map.put("userId", Integer.parseInt(loginParam.getUserId()));
            map.put("username", accountInfo.getUsername());
            map.put("userTypeCode", accountInfo.getUsertypecode());
            map.put("loginTime", new Date());
            map.put("totalTime", accountInfo.getTotaltime());
            accountInfoService.updateAccountInfo(map);
            log.info("登陆时间：{}", map.get("loginTime"));
            return new ResultDto<>().ok(null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultDto<>().error("更新用户信息失败");
        }

    }
}
