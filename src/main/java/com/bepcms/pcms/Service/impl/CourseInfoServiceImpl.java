package com.bepcms.pcms.Service.impl;


import com.bepcms.pcms.Dao.CourseInfoMapper;
import com.bepcms.pcms.Entity.CourseInfo;
import com.bepcms.pcms.Entity.CourseInfoExample;
import com.bepcms.pcms.Service.CourseInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("CourseInfoServiceImpl")
public class CourseInfoServiceImpl implements CourseInfoService {

    @Resource
    private CourseInfoMapper courseInfoMapper;

    @Override
    public List<CourseInfo> getCourseInfoByCondition(Map map) {
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria criteria = courseInfoExample.createCriteria();
        if (map.containsKey("id") && map.get("id").toString() != "") {
            criteria.andCourseidEqualTo(map.get("id").toString());
        }
        if (map.containsKey("name") && map.get("name").toString() != "") {
            criteria.andCoursenameEqualTo(map.get("name").toString());
        }
        return courseInfoMapper.selectByExample(courseInfoExample);
    }
}
