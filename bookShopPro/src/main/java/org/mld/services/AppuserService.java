package org.mld.services;

import org.mld.po.Appuser;

public interface AppuserService {
     public Appuser checkLogin(String loginName,String password);
}
