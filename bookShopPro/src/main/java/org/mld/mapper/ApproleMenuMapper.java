package org.mld.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mld.po.ApproleMenuExample;
import org.mld.po.ApproleMenuKey;

public interface ApproleMenuMapper {
    int countByExample(ApproleMenuExample example);

    int deleteByExample(ApproleMenuExample example);

    int deleteByPrimaryKey(ApproleMenuKey key);

    int insert(ApproleMenuKey record);

    int insertSelective(ApproleMenuKey record);

    List<ApproleMenuKey> selectByExample(ApproleMenuExample example);

    int updateByExampleSelective(@Param("record") ApproleMenuKey record, @Param("example") ApproleMenuExample example);

    int updateByExample(@Param("record") ApproleMenuKey record, @Param("example") ApproleMenuExample example);
}