package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.AdminAccount;

public interface AdminAccountService {

    public AdminAccount getAdminAccountByUserId(int userId);

    public boolean addAdminAccount(AdminAccount record);

}
