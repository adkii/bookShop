package org.mld.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mld.po.AppuserRoleExample;
import org.mld.po.AppuserRoleKey;

public interface AppuserRoleMapper {
    int countByExample(AppuserRoleExample example);

    int deleteByExample(AppuserRoleExample example);

    int deleteByPrimaryKey(AppuserRoleKey key);

    int insert(AppuserRoleKey record);

    int insertSelective(AppuserRoleKey record);

    List<AppuserRoleKey> selectByExample(AppuserRoleExample example);

    int updateByExampleSelective(@Param("record") AppuserRoleKey record, @Param("example") AppuserRoleExample example);

    int updateByExample(@Param("record") AppuserRoleKey record, @Param("example") AppuserRoleExample example);
}