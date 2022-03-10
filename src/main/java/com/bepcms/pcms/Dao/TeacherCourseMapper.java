package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.TeacherCourse;
import com.bepcms.pcms.Entity.TeacherCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherCourseMapper {
    int countByExample(TeacherCourseExample example);

    int deleteByExample(TeacherCourseExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    List<TeacherCourse> selectByExample(TeacherCourseExample example);

    TeacherCourse selectByPrimaryKey(Integer tcid);

    int updateByExampleSelective(@Param("record") TeacherCourse record, @Param("example") TeacherCourseExample example);

    int updateByExample(@Param("record") TeacherCourse record, @Param("example") TeacherCourseExample example);

    int updateByPrimaryKeySelective(TeacherCourse record);

    int updateByPrimaryKey(TeacherCourse record);
}