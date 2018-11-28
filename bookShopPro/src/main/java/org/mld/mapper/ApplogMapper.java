package org.mld.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mld.po.Applog;
import org.mld.po.ApplogExample;

public interface ApplogMapper {
    int countByExample(ApplogExample example);

    int deleteByExample(ApplogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(Applog record);

    int insertSelective(Applog record);

    List<Applog> selectByExample(ApplogExample example);

    Applog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") Applog record, @Param("example") ApplogExample example);

    int updateByExample(@Param("record") Applog record, @Param("example") ApplogExample example);

    int updateByPrimaryKeySelective(Applog record);

    int updateByPrimaryKey(Applog record);
}