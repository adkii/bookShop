package org.mld.mapper;

import org.mld.po.Appmenu;
import org.mld.po.Appuser;

import java.util.List;

public interface AppuserMapperSelf {
    Appuser findUserByName(String loginName);
    List<Appuser> selectUserList(String userName);
}
