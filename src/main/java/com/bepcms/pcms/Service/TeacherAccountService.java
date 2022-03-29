package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.TeacherAccount;

public interface TeacherAccountService {

    public TeacherAccount getTeacherAccountByUserId(int userId);

    public boolean addTeacherAccount(TeacherAccount record);

}
