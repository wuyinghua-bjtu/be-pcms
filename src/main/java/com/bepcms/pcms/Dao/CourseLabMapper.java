package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.CourseLab;
import com.bepcms.pcms.Entity.CourseLabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseLabMapper {
    int countByExample(CourseLabExample example);

    int deleteByExample(CourseLabExample example);

    int deleteByPrimaryKey(Integer labid);

    int insert(CourseLab record);

    int insertSelective(CourseLab record);

    List<CourseLab> selectByExample(CourseLabExample example);

    CourseLab selectByPrimaryKey(Integer labid);

    int updateByExampleSelective(@Param("record") CourseLab record, @Param("example") CourseLabExample example);

    int updateByExample(@Param("record") CourseLab record, @Param("example") CourseLabExample example);

    int updateByPrimaryKeySelective(CourseLab record);

    int updateByPrimaryKey(CourseLab record);
}