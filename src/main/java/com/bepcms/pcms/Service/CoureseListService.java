package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.CourseList;

import java.util.List;
import java.util.Map;

public interface CoureseListService {

    public List<CourseList> getCourseListByCondition(Map map);

    public boolean addCourse(CourseList record);

    public boolean deleteCourse(String id);

    public int getCount(Map map);
}
