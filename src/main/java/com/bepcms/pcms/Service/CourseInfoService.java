package com.bepcms.pcms.Service;


import com.bepcms.pcms.Entity.CourseInfo;

import java.util.List;
import java.util.Map;

public interface CourseInfoService {

    public List<CourseInfo> getCourseInfoByCondition(Map map);

}
