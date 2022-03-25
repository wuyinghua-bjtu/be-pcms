package com.bepcms.pcms.Config.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.realm.Realm;

import java.util.Collection;

public class ShiroModularRealmAuthenticator extends ModularRealmAuthenticator {

    @Override
    protected AuthenticationInfo doAuthenticate(AuthenticationToken authenticationToken) throws AuthenticationException {
        this.assertRealmsConfigured();
        Collection<Realm> realms = this.getRealms();
        for (Realm realm : realms) {
            if (realm.supports(authenticationToken)) {
                return this.doSingleRealmAuthentication(realm, authenticationToken);
            }
        }
        String msg = "当前authenticationToken没有匹配的realm";
        throw new UnknownAccountException(msg);
    }

}
