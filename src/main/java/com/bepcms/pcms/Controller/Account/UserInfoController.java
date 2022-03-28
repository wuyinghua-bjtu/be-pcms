package com.bepcms.pcms.Controller.Account;

import com.bepcms.pcms.Entity.AccountInfo;
import com.bepcms.pcms.Service.AccountInfoService;
import com.bepcms.pcms.model.dto.ResultDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class UserInfoController {
    @Resource
    private AccountInfoService accountInfoService;

    @PostMapping("/account/user/info")
    @ResponseBody
    public ResultDto getUserInfo(HttpServletRequest request, HttpServletResponse response) {

        log.info("查询用户信息");
//        Cookie[] cookies = request.getCookies();
        AccountInfo accountInfo = null;
//
//        if (cookies != null) {
//            for (Cookie c : cookies) {
//                if (c.getName().equals("userId")) {
//                    accountInfo =  accountInfoService.getAccountInfoByUserId(Integer.parseInt(c.getValue()));
//                    if (accountInfo != null)
//                        return new ResultDto<>().ok(accountInfo);
//                    else
//                        return new ResultDto<>().error("未查询到用户信息");
//                }
//            }
//        } else {
//            return new ResultDto<>().error("用户未登录");
//        }
//        return new ResultDto().error("用户未登录");

        HttpSession session = request.getSession();
        Object userId = session.getAttribute("userId");
        if (userId != null) {
            accountInfo =  accountInfoService.getAccountInfoByUserId(Integer.parseInt((String) userId));
            if (accountInfo != null)
                return new ResultDto<>().ok(accountInfo);
            else
                return new ResultDto<>().error("未查询到用户信息");
        } else {
            return new ResultDto<>().error("用户未登录");
        }

    }
}
