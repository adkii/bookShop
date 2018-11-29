package org.mld.mapper;

import org.mld.po.Appuser;

public interface AppuserMapperSelf {
    Appuser findUserByName(String loginName);
}
