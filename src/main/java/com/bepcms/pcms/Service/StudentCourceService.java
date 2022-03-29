package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.CourseInfo;
import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Entity.StudentCourse;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface StudentCourceService {

    public List<CourseInfo> getStudentCourceByCondition(Map map, HttpServletRequest request);

    public int getCount(Map map);

}
