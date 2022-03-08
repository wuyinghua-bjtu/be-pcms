package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.AdminList;
import com.bepcms.pcms.Entity.AdminListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminListMapper {
    int countByExample(AdminListExample example);

    int deleteByExample(AdminListExample example);

    int deleteByPrimaryKey(String adminid);

    int insert(AdminList record);

    int insertSelective(AdminList record);

    List<AdminList> selectByExample(AdminListExample example);

    AdminList selectByPrimaryKey(String adminid);

    int updateByExampleSelective(@Param("record") AdminList record, @Param("example") AdminListExample example);

    int updateByExample(@Param("record") AdminList record, @Param("example") AdminListExample example);

    int updateByPrimaryKeySelective(AdminList record);

    int updateByPrimaryKey(AdminList record);
}