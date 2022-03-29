package com.bepcms.pcms.Dao;

import com.bepcms.pcms.Entity.AdminAccount;
import com.bepcms.pcms.Entity.AdminAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminAccountMapper {
    int countByExample(AdminAccountExample example);

    int deleteByExample(AdminAccountExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(AdminAccount record);

    int insertSelective(AdminAccount record);

    List<AdminAccount> selectByExample(AdminAccountExample example);

    AdminAccount selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") AdminAccount record, @Param("example") AdminAccountExample example);

    int updateByExample(@Param("record") AdminAccount record, @Param("example") AdminAccountExample example);

    int updateByPrimaryKeySelective(AdminAccount record);

    int updateByPrimaryKey(AdminAccount record);
}