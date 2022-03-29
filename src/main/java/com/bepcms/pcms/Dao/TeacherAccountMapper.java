package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.TeacherAccount;
import com.bepcms.pcms.Entity.TeacherAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherAccountMapper {
    int countByExample(TeacherAccountExample example);

    int deleteByExample(TeacherAccountExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(TeacherAccount record);

    int insertSelective(TeacherAccount record);

    List<TeacherAccount> selectByExample(TeacherAccountExample example);

    TeacherAccount selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") TeacherAccount record, @Param("example") TeacherAccountExample example);

    int updateByExample(@Param("record") TeacherAccount record, @Param("example") TeacherAccountExample example);

    int updateByPrimaryKeySelective(TeacherAccount record);

    int updateByPrimaryKey(TeacherAccount record);
}