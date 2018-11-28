package org.mld.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mld.po.Appuser;
import org.mld.po.AppuserExample;

public interface AppuserMapper {
    int countByExample(AppuserExample example);

    int deleteByExample(AppuserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Appuser record);

    int insertSelective(Appuser record);

    List<Appuser> selectByExample(AppuserExample example);

    Appuser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Appuser record, @Param("example") AppuserExample example);

    int updateByExample(@Param("record") Appuser record, @Param("example") AppuserExample example);

    int updateByPrimaryKeySelective(Appuser record);

    int updateByPrimaryKey(Appuser record);
}