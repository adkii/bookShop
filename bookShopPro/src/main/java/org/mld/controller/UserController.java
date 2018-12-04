package org.mld.controller;

import com.github.pagehelper.PageInfo;
import org.mld.po.Appuser;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private AppuserService appuserService;
    @RequestMapping(value = "/userList")
    @ResponseBody
    public Map<String, Object> userList(String userName,Integer page,Integer pageSize){
        Map<String,Object> result=new HashMap<String, Object>();
        PageInfo<Appuser> pageInfo =  appuserService.getUserListPage(userName, 1, 10);
        result.put("code",0);
        result.put("total",pageInfo.getTotal());
        result.put("pageSize",pageInfo.getPageSize());
        result.put("page",pageInfo.getLastPage());
        result.put("rows",pageInfo.getList());
        return result;
    }
}
