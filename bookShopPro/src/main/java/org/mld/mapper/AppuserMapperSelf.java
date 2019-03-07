package org.mld.mapper;

import org.mld.po.Appmenu;
import org.mld.po.Appuser;

import java.util.List;
import java.util.Map;

public interface AppuserMapperSelf {
    Appuser findUserByName(String loginName);
    List<Appuser> selectUserList(String userName);
    Appuser getBaseInfo(Integer id);
    Map<String,Object> getBaseInfo2(Integer id);
}
