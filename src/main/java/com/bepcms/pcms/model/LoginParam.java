package com.bepcms.pcms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginParam {

    /**
     * 用户名
     */
    private String userId;

    /**
     * 密码
     */
    private String password;

    /**
     * 重定向地址
     */
    private String service;

    // 用户类型
    private String loginType;

}
