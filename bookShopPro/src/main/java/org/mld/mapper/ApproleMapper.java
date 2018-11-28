package org.mld.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mld.po.Approle;
import org.mld.po.ApproleExample;

public interface ApproleMapper {
    int countByExample(ApproleExample example);

    int deleteByExample(ApproleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Approle record);

    int insertSelective(Approle record);

    List<Approle> selectByExample(ApproleExample example);

    Approle selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Approle record, @Param("example") ApproleExample example);

    int updateByExample(@Param("record") Approle record, @Param("example") ApproleExample example);

    int updateByPrimaryKeySelective(Approle record);

    int updateByPrimaryKey(Approle record);
}