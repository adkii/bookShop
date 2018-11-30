package org.mld.services;

import org.mld.po.Appmenu;
import org.mld.po.Appuser;

import java.util.List;


public interface AppuserService {
     Appuser checkLogin(String loginName,String password);
     List<Appmenu> getMenuListByUser(Appuser appuser);
}
