package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.StudentList;

import java.util.List;

public interface StudentListService {

    public StudentList getStudentListByPrimartKey(String studentId);

    public boolean addStudent(StudentList record);

    public List<StudentList> getStudentListAll();

    public List<StudentList> getStudentListByName(String studentName);
}
