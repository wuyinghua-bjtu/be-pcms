package com.bepcms.pcms.Service;

import com.bepcms.pcms.Entity.AdminList;

import java.util.List;
import java.util.Map;

public interface AdminListService {

    public List<AdminList> getAdminListByCondition(Map map);

}
