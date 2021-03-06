package org.mld.controller;

import com.github.pagehelper.PageInfo;
import org.mld.po.Appuser;
import org.mld.po.Appuserinfo;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private AppuserService appuserService;
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
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
    @RequestMapping(value = "/addUser")
    @ResponseBody
    public Map<String,Object> addUser(Appuserinfo appuserinfo,Appuser appuser){
        return appuserService.addUser(appuserinfo,appuser);
    }
    @RequestMapping(value = "/getAppuser")
    @ResponseBody
    public Appuser getAppuser(Integer id){
        return appuserService.getUserById(id);
    }
    @RequestMapping(value = "/getBaseInfo")
    @ResponseBody
    public Appuser getBaseInfo(Integer id){return appuserService.getBaseInfo(id);}
    @RequestMapping(value = "/getBaseInfo2")
    @ResponseBody
    public Map<String,Object> getBaseInfo2(Integer id){return appuserService.getBaseInfo2(id);}
}
