package com.bepcms.pcms.Controller;


import com.bepcms.pcms.model.LoginParam;
import com.bepcms.pcms.model.dto.ResultDto;
import com.bepcms.pcms.realm.UserRealm;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public ResultDto consoleLogin(@RequestBody LoginParam loginParam, HttpServletRequest request, HttpServletResponse response) {

        DefaultSecurityManager manager = new DefaultSecurityManager();
        UserRealm realm = new UserRealm();
        manager.setRealm(realm);
        SecurityUtils.setSecurityManager(manager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(loginParam.getUsername(), loginParam.getPassword());
        subject.login(token);

        return new ResultDto().error("用户是否登录成功="+subject.isAuthenticated());

    }

}
