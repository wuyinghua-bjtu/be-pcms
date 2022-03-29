package com.bepcms.pcms.Service.impl;

import com.bepcms.pcms.Dao.TeacherAccountMapper;
import com.bepcms.pcms.Entity.TeacherAccount;
import com.bepcms.pcms.Service.TeacherAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("TeacherAccountService")
public class TeacherAccountServiceImpl implements TeacherAccountService {

    @Resource
    private TeacherAccountMapper teacherAccountMapper;

    @Override
    public TeacherAccount getTeacherAccountByUserId(int userId) {
        return teacherAccountMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addTeacherAccount(TeacherAccount record) {
        boolean res = false;
        try {
            teacherAccountMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
