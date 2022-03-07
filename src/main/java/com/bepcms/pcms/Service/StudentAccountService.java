package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.StudentAccount;

public interface StudentAccountService {

    public StudentAccount getStudentAccountByUserId(int userId);

    public boolean addStudentAccount(StudentAccount record);
}
