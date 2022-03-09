package com.bepcms.pcms.Service.impl;

import com.bepcms.pcms.Dao.AdminListMapper;
import com.bepcms.pcms.Entity.AdminList;
import com.bepcms.pcms.Entity.AdminListExample;
import com.bepcms.pcms.Service.AdminListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("AdminListService")
public class AdminListServiceImpl implements AdminListService {

    @Resource
    private AdminListMapper adminListMapper;

    public List<AdminList> getAdminListByCondition(Map map) {
        AdminListExample adminListExample = new AdminListExample();
        AdminListExample.Criteria criteria = adminListExample.createCriteria();
        if (map.containsKey("id") && map.get("id").toString() != "") {
            criteria.andAdminidEqualTo(map.get("id").toString());
        }
        if (map.containsKey("name") && map.get("name").toString() != "") {
            criteria.andAdminnameEqualTo(map.get("name").toString());
        }
        return adminListMapper.selectByExample(adminListExample);
    }

    @Override
    public boolean deleteAdmin(String id) {
        boolean res = false;
        try {
            adminListMapper.deleteByPrimaryKey(id);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;    }

    @Override
    public boolean addAdmin(AdminList record) {
        boolean res = false;
        try {
            adminListMapper.insertSelective(record);
            res = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
