package org.mld.services.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.mld.mapper.*;
import org.mld.po.*;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppuserServiceImpl implements AppuserService {
    @Autowired
    private  AppuserMapper appuserMapper;
    @Autowired
    private AppuserMapperSelf appuserMapperSelf;
    @Autowired
    private AppmenuMapperSelf appmenuMapperSelf;
    @Autowired
    private AppuserRoleMapperSelf appuserRoleMapperSelf;
    @Autowired
    private AppmenuMapper appmenuMapper;
    @Autowired
    private ApproleMenuMapperSelf approleMenuMapperSelf;
    @Autowired
    private AppuserinfoMapper appuserinfoMapper;
    public Appuser checkLogin(String loginName,String password) {
        Appuser appuser=appuserMapperSelf.findUserByName(loginName);
        if(appuser!=null){
            if(appuser.getPassword().equals(password)){
                return appuser;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }
    //查询菜单
    public List<Appmenu> getMenuListByUser(Integer roleId,Integer parentId) {
        List<Integer> menuIdList=approleMenuMapperSelf.selectMenuIdByRole(roleId);
        AppmenuExample appmenuExample=new AppmenuExample();
        appmenuExample.or().andMenuIdIn(menuIdList).andParentIdEqualTo(parentId);
        List<Appmenu> appmenuList=appmenuMapper.selectByExample(appmenuExample);
        return appmenuList;
    }
    //获取当前用户权限
    public Integer getRole(Appuser appuser) {
        return appuserRoleMapperSelf.selectRoleIdByU(appuser.getUserId());
    }

    //分页查询用户
    public PageInfo<Appuser> getUserListPage(String userName, Integer pageNo, Integer pageSize) {
        pageNo = pageNo == null?1:pageNo;
        pageSize = pageSize == null?10:pageSize;
        PageHelper.startPage(pageNo, pageSize);
        List<Appuser> list = appuserMapperSelf.selectUserList(userName);
        //用PageInfo对结果进行包装
        PageInfo<Appuser> page = new PageInfo<Appuser>(list);
        return page;
    }
    @Transactional
    public Map<String, Object> addUser(Appuserinfo appuserinfo, Appuser appuser) {
        appuserinfoMapper.insert(appuserinfo);
        appuser.setInfoId(appuserinfo.getInfoId());
        appuserMapper.insert(appuser);
        Map<String,Object> result=new HashMap<String, Object>();
        result.put("code",1);
        result.put("msg","sucess");
        return result;
    }

    public Appuser getUserById(int id) {
        return appuserMapper.selectByPrimaryKey(id);
    }

    public Appuser getBaseInfo(int id) {
        return appuserMapperSelf.getBaseInfo(id);
    }
    public Map<String,Object> getBaseInfo2(int id) {
        return appuserMapperSelf.getBaseInfo2(id);
    }
}
