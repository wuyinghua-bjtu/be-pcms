package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Entity.CourseListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseListMapper {
    int countByExample(CourseListExample example);

    int deleteByExample(CourseListExample example);

    int deleteByPrimaryKey(String courseid);

    int insert(CourseList record);

    int insertSelective(CourseList record);

    List<CourseList> selectByExample(CourseListExample example);

    CourseList selectByPrimaryKey(String courseid);

    int updateByExampleSelective(@Param("record") CourseList record, @Param("example") CourseListExample example);

    int updateByExample(@Param("record") CourseList record, @Param("example") CourseListExample example);

    int updateByPrimaryKeySelective(CourseList record);

    int updateByPrimaryKey(CourseList record);
}