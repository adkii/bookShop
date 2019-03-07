package org.mld.services;

import com.github.pagehelper.PageInfo;
import org.mld.po.Appmenu;
import org.mld.po.Appuser;
import org.mld.po.Appuserinfo;

import java.util.List;
import java.util.Map;


public interface AppuserService {
     //验证登录
     Appuser checkLogin(String loginName,String password);
     //根据权限查找用户菜单
     List<Appmenu> getMenuListByUser(Integer roleId,Integer parentId);
     //获取用户权限
     Integer getRole(Appuser appuser);
     //获取分页列表
     PageInfo<Appuser> getUserListPage(String userName,Integer pageNo,Integer pageSize);
     //添加用户
     Map<String,Object> addUser(Appuserinfo appuserinfo,Appuser appuser);
     //获取用户
     Appuser getUserById(int id);
     //获取用户基本信息及登录信息(以对象方式)
     Appuser getBaseInfo(int id);
     //以Map方式获取用户基本信息及登录信息
     Map<String,Object> getBaseInfo2(int id);
}
