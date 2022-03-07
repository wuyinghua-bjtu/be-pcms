package com.bepcms.pcms.Dao;

import java.util.List;

import com.bepcms.pcms.Entity.StudentList;
import com.bepcms.pcms.Entity.StudentListExample;
import org.apache.ibatis.annotations.Param;

public interface StudentListMapper {
    int countByExample(StudentListExample example);

    int deleteByExample(StudentListExample example);

    int deleteByPrimaryKey(String studentid);

    int insert(StudentList record);

    int insertSelective(StudentList record);

    List<StudentList> selectByExample(StudentListExample example);

    StudentList selectByPrimaryKey(String studentid);

    int updateByExampleSelective(@Param("record") StudentList record, @Param("example") StudentListExample example);

    int updateByExample(@Param("record") StudentList record, @Param("example") StudentListExample example);

    int updateByPrimaryKeySelective(StudentList record);

    int updateByPrimaryKey(StudentList record);

    List<StudentList> selectAll();
}