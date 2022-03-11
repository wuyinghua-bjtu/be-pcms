package com.bepcms.pcms.Service.impl;


import com.bepcms.pcms.Dao.StudentCourseMapper;
import com.bepcms.pcms.Entity.CourseInfo;
import com.bepcms.pcms.Entity.CourseList;
import com.bepcms.pcms.Entity.StudentCourse;
import com.bepcms.pcms.Entity.StudentCourseExample;
import com.bepcms.pcms.Service.StudentCourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Slf4j
@Service("StudentCourceServiceImpl")
public class StudentCourceServiceImpl implements StudentCourceService {

    @Resource
    private StudentCourseMapper studentCourseMapper;


    @Override
    public List<CourseInfo> getStudentCourceByCondition(Map map) {
//        StudentCourseExample studentCourseExample = new StudentCourseExample();
//        StudentCourseExample.Criteria criteria = studentCourseExample.createCriteria();
//        if (map.containsKey("id") && map.get("id").toString() != "") {
//            criteria.andStudentidEqualTo(map.get("id").toString());
//        }
//        List<StudentCourse> lists = this.studentCourseMapper.selectByExample(studentCourseExample);
        return this.studentCourseMapper.getCourseListByStudentid(map.get("id").toString());
    }

    @Override
    public int getCount(Map map) {
        return this.studentCourseMapper.countByExample(new StudentCourseExample());
    }
}
