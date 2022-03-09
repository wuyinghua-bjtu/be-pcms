package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.StudentList;

import java.util.List;
import java.util.Map;

public interface StudentListService {

    public StudentList getStudentListByPrimartKey(String studentId);

    public boolean addStudent(StudentList record);

    public List<StudentList> getStudentListAll();

    public List<StudentList> getStudentListByCondition(Map map);

    public boolean deleteStudent(String id);
}
