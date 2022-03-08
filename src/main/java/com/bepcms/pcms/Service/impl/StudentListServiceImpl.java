package com.bepcms.pcms.Service.impl;

import com.bepcms.pcms.Dao.StudentListMapper;
import com.bepcms.pcms.Entity.StudentList;
import com.bepcms.pcms.Entity.StudentListExample;
import com.bepcms.pcms.Service.StudentListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Slf4j
@Service("StudentListService")
public class StudentListServiceImpl implements StudentListService {

    @Resource
    private StudentListMapper studentListMapper;

    public StudentList getStudentListByPrimartKey(String studentId) {
        return studentListMapper.selectByPrimaryKey(studentId);
    }

    public boolean addStudent(StudentList record) {
        boolean res = false;
        try {
            studentListMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<StudentList> getStudentListAll() {
        return studentListMapper.selectAll();
    }

    public List<StudentList> getStudentListByCondition(Map map) {
        StudentListExample studentListExample = new StudentListExample();
        StudentListExample.Criteria criteria = studentListExample.createCriteria();
        if (map.containsKey("id") && map.get("id").toString() != "") {
            criteria.andStudentidEqualTo(map.get("id").toString());
        }
        if (map.containsKey("name") && map.get("name").toString() != "") {
            criteria.andStudentnameEqualTo(map.get("name").toString());
        }
        return studentListMapper.selectByExample(studentListExample);
    }
}
