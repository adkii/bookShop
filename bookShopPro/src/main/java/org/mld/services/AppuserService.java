package org.mld.services;

import com.github.pagehelper.PageInfo;
import org.mld.po.Appmenu;
import org.mld.po.Appuser;

import java.util.List;


public interface AppuserService {
     //验证登录
     Appuser checkLogin(String loginName,String password);
     //根据权限查找用户菜单
     List<Appmenu> getMenuListByUser(Integer roleId,Integer parentId);
     //获取用户权限
     Integer getRole(Appuser appuser);
     //获取分页列表
     PageInfo<Appuser> getUserListPage(String userName,Integer pageNo,Integer pageSize);
}
