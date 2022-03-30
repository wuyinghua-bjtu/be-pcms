package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.CourseLab;

import java.util.List;
import java.util.Map;

public interface CourseLabService {

    public List<CourseLab> getCourseLabByCondition(Map map);

    public boolean addCourseLab(CourseLab record);

    public int getCount(Map map);

}
