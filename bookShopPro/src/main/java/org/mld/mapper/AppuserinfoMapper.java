package org.mld.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mld.po.Appuserinfo;
import org.mld.po.AppuserinfoExample;

public interface AppuserinfoMapper {
    long countByExample(AppuserinfoExample example);

    int deleteByExample(AppuserinfoExample example);

    int deleteByPrimaryKey(Integer infoId);

    int insert(Appuserinfo record);

    int insertSelective(Appuserinfo record);

    List<Appuserinfo> selectByExample(AppuserinfoExample example);

    Appuserinfo selectByPrimaryKey(Integer infoId);

    int updateByExampleSelective(@Param("record") Appuserinfo record, @Param("example") AppuserinfoExample example);

    int updateByExample(@Param("record") Appuserinfo record, @Param("example") AppuserinfoExample example);

    int updateByPrimaryKeySelective(Appuserinfo record);

    int updateByPrimaryKey(Appuserinfo record);
}