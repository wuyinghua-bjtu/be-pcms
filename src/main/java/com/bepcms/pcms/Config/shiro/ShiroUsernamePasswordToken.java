package com.bepcms.pcms.Config.shiro;

import com.bepcms.pcms.Entity.AccountInfo;
import com.bepcms.pcms.Entity.StudentAccount;
import org.apache.shiro.authc.UsernamePasswordToken;

public class ShiroUsernamePasswordToken extends UsernamePasswordToken {
    private static final long serialVersionUID = 1L;

    private String userId;

    private StudentAccount user;

    public ShiroUsernamePasswordToken(String userId,
                                      char[] password, boolean rememberMe, String host) {
        super(userId, password, rememberMe, host);
        this.userId = userId;
    }

    public ShiroUsernamePasswordToken(String userId, char[] password) {
        super(userId, password);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public StudentAccount getUser() {
        return user;
    }
    public void setUser(StudentAccount user) {
        this.user = user;
    }
}