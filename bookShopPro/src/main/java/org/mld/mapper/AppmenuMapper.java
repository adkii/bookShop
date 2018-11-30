package org.mld.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mld.po.Appmenu;
import org.mld.po.AppmenuExample;

public interface AppmenuMapper {
    int countByExample(AppmenuExample example);

    int deleteByExample(AppmenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(Appmenu record);

    int insertSelective(Appmenu record);

    List<Appmenu> selectByExample(AppmenuExample example);

    Appmenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") Appmenu record, @Param("example") AppmenuExample example);

    int updateByExample(@Param("record") Appmenu record, @Param("example") AppmenuExample example);

    int updateByPrimaryKeySelective(Appmenu record);

    int updateByPrimaryKey(Appmenu record);
}