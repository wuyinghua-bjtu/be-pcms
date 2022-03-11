package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.CourseInfo;
import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Entity.StudentCourse;
import com.bepcms.pcms.Entity.StudentCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentCourseMapper {
    int countByExample(StudentCourseExample example);

    int deleteByExample(StudentCourseExample example);

    int deleteByPrimaryKey(Integer scid);

    int insert(StudentCourse record);

    int insertSelective(StudentCourse record);

    List<StudentCourse> selectByExample(StudentCourseExample example);

    StudentCourse selectByPrimaryKey(Integer scid);

    int updateByExampleSelective(@Param("record") StudentCourse record, @Param("example") StudentCourseExample example);

    int updateByExample(@Param("record") StudentCourse record, @Param("example") StudentCourseExample example);

    int updateByPrimaryKeySelective(StudentCourse record);

    int updateByPrimaryKey(StudentCourse record);

    List<CourseInfo> getCourseListByStudentid(String id);
}