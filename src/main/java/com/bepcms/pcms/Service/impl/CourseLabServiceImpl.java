package com.bepcms.pcms.Service.impl;

import com.bepcms.pcms.Dao.CourseLabMapper;
import com.bepcms.pcms.Entity.CourseLab;
import com.bepcms.pcms.Entity.CourseLabExample;
import com.bepcms.pcms.Service.CourseLabService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("CourseLabService")
public class CourseLabServiceImpl implements CourseLabService {
    @Override
    public int getCount(Map map) {
        CourseLabExample courseLabExample = new CourseLabExample();
        CourseLabExample.Criteria criteria = courseLabExample.createCriteria();
        if (map.containsKey("infoId") && map.get("infoId").toString() != "") {
            criteria.andInfoidEqualTo(Integer.parseInt(map.get("infoId").toString()));
        }
        return courseLabMapper.countByExample(courseLabExample);
    }

    @Resource
    private CourseLabMapper courseLabMapper;

    @Override
    public List<CourseLab> getCourseLabByCondition(Map map) {
        CourseLabExample courseLabExample = new CourseLabExample();
        CourseLabExample.Criteria criteria = courseLabExample.createCriteria();
        if (map.containsKey("courseId") && map.get("courseId").toString() != "") {
            criteria.andInfoidEqualTo(Integer.parseInt(map.get("courseId").toString()));
        }
        return courseLabMapper.selectByExample(courseLabExample);
    }

    @Override
    public boolean addCourseLab(CourseLab record) {
        boolean res = false;
        try {
            courseLabMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
