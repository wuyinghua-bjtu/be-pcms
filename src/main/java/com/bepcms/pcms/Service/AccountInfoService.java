package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.AccountInfo;

import java.util.Map;

public interface AccountInfoService {

    public AccountInfo getAccountInfoByUserId(int id);

    public boolean updateAccountInfo(Map map);

}
