package com.bepcms.pcms.Service.impl;

import com.bepcms.pcms.Dao.AccountInfoMapper;
import com.bepcms.pcms.Entity.AccountInfo;
import com.bepcms.pcms.Service.AccountInfoService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

public class AccountInfoServiceImpl implements AccountInfoService {

    @Resource
    private AccountInfoMapper accountInfoMapper;

    @Override
    public AccountInfo getAccountInfoByUserId(int id) {
        return accountInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateAccountInfo(Map map) {
        boolean res = false;
        AccountInfo record = new AccountInfo();
        record.setUserid(Integer.parseInt(map.get("userId").toString()));
        record.setUsername(map.get("username").toString());
        record.setUsertypecode(map.get("userTypeCode").toString());
        record.setLogintime((Date) map.get("loginTime"));
        record.setTotaltime(Integer.parseInt(map.get("totalTime").toString()));

        try {
            accountInfoMapper.updateByPrimaryKey(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
