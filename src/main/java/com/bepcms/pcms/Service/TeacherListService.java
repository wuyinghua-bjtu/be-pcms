package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.TeacherList;

import java.util.List;
import java.util.Map;

public interface TeacherListService {

    public List<TeacherList> getTeacherListByCondition(Map map);

    public boolean addTeacher(TeacherList record);

    public boolean deleteTeacher(String id);

}
