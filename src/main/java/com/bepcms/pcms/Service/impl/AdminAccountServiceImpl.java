package com.bepcms.pcms.Service.impl;

import com.bepcms.pcms.Dao.AdminAccountMapper;
import com.bepcms.pcms.Entity.AdminAccount;
import com.bepcms.pcms.Service.AdminAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("AdminAccountService")
public class AdminAccountServiceImpl implements AdminAccountService {

    @Resource
    private AdminAccountMapper adminAccountMapper;

    @Override
    public AdminAccount getAdminAccountByUserId(int userId) {
        return adminAccountMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addAdminAccount(AdminAccount record) {
        boolean res = false;
        try {
            adminAccountMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
