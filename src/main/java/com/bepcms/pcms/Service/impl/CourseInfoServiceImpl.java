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
    public int getCount(Map map) {
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria criteria = courseInfoExample.createCriteria();
        if (map.containsKey("courseId") && map.get("courseId").toString() != "") {
            criteria.andCourseidEqualTo(map.get("courseId").toString());
        }
        if (map.containsKey("courseName") && map.get("courseName").toString() != "") {
            criteria.andCoursenameEqualTo(map.get("courseName").toString());
        }
        if (map.containsKey("teacherId") && map.get("teacherId").toString() != "") {
            criteria.andTeacheridEqualTo(map.get("teacherId").toString());
        }
        if (map.containsKey("teacherName") && map.get("teacherName").toString() != "") {
            criteria.andTeachernameEqualTo(map.get("teacherName").toString());
        }
        if (map.containsKey("college") && map.get("college").toString() != "") {
            criteria.andCollegeEqualTo(map.get("college").toString());
        }
        if (map.containsKey("major") && map.get("major").toString() != "") {
            criteria.andMajorEqualTo(map.get("major").toString());
        }
        return courseInfoMapper.countByExample(courseInfoExample);
    }

    @Override
    public boolean addCourse(CourseInfo record) {
        boolean res = false;
        try {
            courseInfoMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public List<CourseInfo> getCourseInfoByCondition(Map map) {
        CourseInfoExample courseInfoExample = new CourseInfoExample();
        CourseInfoExample.Criteria criteria = courseInfoExample.createCriteria();
        if (map.containsKey("courseId") && map.get("courseId").toString() != "") {
            criteria.andCourseidEqualTo(map.get("courseId").toString());
        }
        if (map.containsKey("courseName") && map.get("courseName").toString() != "") {
            criteria.andCoursenameEqualTo(map.get("courseName").toString());
        }
        if (map.containsKey("teacherId") && map.get("teacherId").toString() != "") {
            criteria.andTeacheridEqualTo(map.get("teacherId").toString());
        }
        if (map.containsKey("teacherName") && map.get("teacherName").toString() != "") {
            criteria.andTeachernameEqualTo(map.get("teacherName").toString());
        }
        if (map.containsKey("college") && map.get("college").toString() != "") {
            criteria.andCollegeEqualTo(map.get("college").toString());
        }
        if (map.containsKey("major") && map.get("major").toString() != "") {
            criteria.andMajorEqualTo(map.get("major").toString());
        }
        return courseInfoMapper.selectByExample(courseInfoExample);
    }


}
