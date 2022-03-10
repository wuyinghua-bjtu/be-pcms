package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Entity.StudentCourse;

import java.util.List;
import java.util.Map;

public interface StudentCourceService {

    public List<CourseList> getStudentCourceByCondition(Map map);

    public int getCount(Map map);

}
