package com.bepcms.pcms.Config.shiro;

import com.bepcms.pcms.Service.StudentAccountService;
import com.bepcms.pcms.realm.UserRealm;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ShiroConfig {

    private StudentAccountService studentAccountService;

    @Bean
    public ShiroFilterFactoryBean shiroFilter(DefaultSecurityManager securityManager) {

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        Map<String, String> filterChainDefinitionMap = new LinkedHashMap();
        filterChainDefinitionMap.put("/**", "anon");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;

    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setAuthenticator(modularRealmAuthenticator());
        List<Realm> realms = new ArrayList<>();
        realms.add(userRealm());
        securityManager.setRealms(realms);
        // 自定义session管理
        return securityManager;
    }

    public ModularRealmAuthenticator modularRealmAuthenticator() {
        ShiroModularRealmAuthenticator authenticator = new ShiroModularRealmAuthenticator();
        return authenticator;
    }

    public UserRealm userRealm() {
        UserRealm userRealm = new UserRealm();
        return userRealm;
    }

}
