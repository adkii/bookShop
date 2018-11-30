package org.mld.services.serviceImpl;

import org.mld.mapper.AppmenuMapperSelf;
import org.mld.mapper.AppuserMapper;
import org.mld.mapper.AppuserMapperSelf;
import org.mld.po.Appmenu;
import org.mld.po.Appuser;
import org.mld.po.AppuserExample;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppuserServiceImpl implements AppuserService {
    @Autowired
    private AppuserMapperSelf appuserMapperSelf;
    @Autowired
    private AppmenuMapperSelf appmenuMapperSelf;
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

    public List<Appmenu> getMenuListByUser(Appuser appuser) {
        //改到现在
        appmenuMapperSelf.findMenuByRole(1);
        return null;
    }
}
