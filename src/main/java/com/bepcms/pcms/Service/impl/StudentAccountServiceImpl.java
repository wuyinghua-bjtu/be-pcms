package com.bepcms.pcms.Service.impl;


import com.bepcms.pcms.Dao.StudentAccountMapper;
import com.bepcms.pcms.Entity.StudentAccount;
import com.bepcms.pcms.Service.StudentAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("StudentAccountService")
public class StudentAccountServiceImpl implements StudentAccountService {

    @Resource
    private StudentAccountMapper studentAccountMapper;

    public StudentAccount getStudentAccountByUserId(int userId) {
        return studentAccountMapper.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addStudentAccount(StudentAccount record) {
        boolean res = false;
        try {
            studentAccountMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
