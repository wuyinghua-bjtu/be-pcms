package com.bepcms.pcms.Service.impl;


import com.bepcms.pcms.Dao.CourseListMapper;
import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Entity.CourseListExample;
import com.bepcms.pcms.Service.CoureseListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("CourseListService")
public class CourseListServiceImpl implements CoureseListService {

    @Resource
    private CourseListMapper courseListMapper;


    @Override
    public List<CourseList> getCourseListByCondition(Map map) {
        CourseListExample courseListExample = new CourseListExample();
        CourseListExample.Criteria criteria = courseListExample.createCriteria();
        if (map.containsKey("id") && map.get("id").toString() != "") {
            criteria.andCourseidEqualTo(map.get("id").toString());
        }
        if (map.containsKey("name") && map.get("name").toString() != "") {
            criteria.andCoursenameEqualTo(map.get("name").toString());
        }
        return courseListMapper.selectByExample(courseListExample);
    }

    @Override
    public boolean addCourse(CourseList record) {
        boolean res = false;
        try {
            courseListMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public boolean deleteCourse(String id) {
        boolean res = false;
        try {
            courseListMapper.deleteByPrimaryKey(id);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
