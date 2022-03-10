package com.bepcms.pcms.Service.impl;


import com.bepcms.pcms.Dao.TeacherListMapper;
import com.bepcms.pcms.Entity.TeacherList;
import com.bepcms.pcms.Entity.TeacherListExample;
import com.bepcms.pcms.Service.TeacherListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("TeacherListService")
public class TeacherListServiceImpl implements TeacherListService {

    @Resource
    private TeacherListMapper teacherListMapper;

    @Override
    public List<TeacherList> getTeacherListByCondition(Map map) {
        TeacherListExample teacherListExample = new TeacherListExample();
        TeacherListExample.Criteria criteria = teacherListExample.createCriteria();
        if (map.containsKey("id") && map.get("id").toString() != "") {
            criteria.andTeacheridEqualTo(map.get("id").toString());
        }
        if (map.containsKey("name") && map.get("name").toString() != "") {
            criteria.andTeachernameEqualTo(map.get("name").toString());
        }
        return teacherListMapper.selectByExample(teacherListExample);
    }

    @Override
    public int getCount(Map map) {
        TeacherListExample teacherListExample = new TeacherListExample();
        TeacherListExample.Criteria criteria = teacherListExample.createCriteria();
        if (map.containsKey("id") && map.get("id").toString() != "") {
            criteria.andTeacheridEqualTo(map.get("id").toString());
        }
        if (map.containsKey("name") && map.get("name").toString() != "") {
            criteria.andTeachernameEqualTo(map.get("name").toString());
        }
        return teacherListMapper.countByExample(teacherListExample);
    }

    @Override
    public boolean deleteTeacher(String id) {
        boolean res = false;
        try {
            teacherListMapper.deleteByPrimaryKey(id);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public boolean addTeacher(TeacherList record) {
        boolean res = false;
        try {
            teacherListMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
