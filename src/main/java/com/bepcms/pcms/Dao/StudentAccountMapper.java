package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.StudentAccount;

public interface StudentAccountMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(StudentAccount record);

    int insertSelective(StudentAccount record);

    StudentAccount selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(StudentAccount record);

    int updateByPrimaryKey(StudentAccount record);
}