package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.TeacherList;
import com.bepcms.pcms.Entity.TeacherListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherListMapper {
    int countByExample(TeacherListExample example);

    int deleteByExample(TeacherListExample example);

    int deleteByPrimaryKey(String teacherid);

    int insert(TeacherList record);

    int insertSelective(TeacherList record);

    List<TeacherList> selectByExample(TeacherListExample example);

    TeacherList selectByPrimaryKey(String teacherid);

    int updateByExampleSelective(@Param("record") TeacherList record, @Param("example") TeacherListExample example);

    int updateByExample(@Param("record") TeacherList record, @Param("example") TeacherListExample example);

    int updateByPrimaryKeySelective(TeacherList record);

    int updateByPrimaryKey(TeacherList record);
}