package org.mld.services.serviceImpl;

import org.apache.ibatis.annotations.Select;
import org.mld.mapper.AppuserMapper;
import org.mld.mapper.AppuserMapperSelf;
import org.mld.po.Appuser;
import org.mld.po.AppuserExample;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppuserServiceImpl implements AppuserService {
    @Autowired
    private AppuserMapperSelf appuserMapperSelf;
    public Appuser checkLogin(String loginName,String password) {
        Appuser appuser=appuserMapperSelf.findUserByLName(loginName);
        if(appuser!=null){
            if(loginName.equals(appuser.getPassword())){
                return appuser;
            }else{
                return null;
            }
        }else{
                return null;
        }
    }
}
