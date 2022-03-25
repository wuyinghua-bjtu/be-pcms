package com.bepcms.pcms.realm;

import com.bepcms.pcms.Config.shiro.ShiroUsernamePasswordToken;
import com.bepcms.pcms.Entity.AccountInfo;
import com.bepcms.pcms.Entity.StudentAccount;
import com.bepcms.pcms.Service.AccountInfoService;
import com.bepcms.pcms.Service.StudentAccountService;
import com.bepcms.pcms.model.Principal;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

@Slf4j
public class UserRealm extends AuthorizingRealm {

    private StudentAccountService studentAccountService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        ShiroUsernamePasswordToken authcToken = (ShiroUsernamePasswordToken) token;

        StudentAccount user = getUser(authcToken);
        if (user == null) {
            log.info("当前账号不存在");
            return null;
        }

        authcToken.setUser(user);
        return new SimpleAuthenticationInfo(new Principal(user), user.getPassword(), getName());
    }

    private StudentAccount getUser(ShiroUsernamePasswordToken token) {
        int userId = Integer.parseInt(token.getUserId());
        return studentAccountService.getStudentAccountByUserId(userId);
    }
}
