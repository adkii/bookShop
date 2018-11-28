package org.mld.services.serviceImpl;

import org.mld.mapper.AppuserMapper;
import org.mld.po.Appuser;
import org.mld.po.AppuserExample;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppuserServiceImpl implements AppuserService {
    @Autowired
    private AppuserMapper appuserMapper;
    public Appuser checkLogin() {
     return new Appuser();
    }
}
