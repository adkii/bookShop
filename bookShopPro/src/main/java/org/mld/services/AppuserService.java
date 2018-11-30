package org.mld.services;

import org.mld.po.Appuser;

public interface AppuserService {
     Appuser checkLogin(String loginName,String password);
}
