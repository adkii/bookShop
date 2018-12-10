package org.mld.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.mld.po.Appmenu;
import org.mld.po.Appuser;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author mld
 */
@Controller
public class LoginController {
    @Autowired
    private AppuserService appuserService;
    @RequestMapping(value = "/login")
    public String login(){
        return "login/login";
    }
    @RequestMapping(value = "/checkLogin")
    public String checkLogin(String loginName, String password, HttpSession session, Model model){
        Appuser appuser=appuserService.checkLogin(loginName,password);
        if(appuser!=null){
            session.setAttribute("appuser",appuser);
            return "redirect:/loginSuccess";
        }else{
            model.addAttribute("msg","用户名或密码错误");
            return "redirect:/login";
        }
    }
    @RequestMapping(value = "/loginSuccess")
    public String loginSuccess(){
        return "login/index";
    }
    @ResponseBody
    @RequestMapping(value = "/getMenuList")
    public Map<String,Object> getMenuList(HttpSession session) throws JsonProcessingException {
        Appuser appuser=(Appuser) session.getAttribute("appuser");
        Integer roleId=appuserService.getRole(appuser);
        //获取当前用户菜单,一级菜单
        List<Appmenu> listFirst= appuserService.getMenuListByUser(roleId,0);
        Map<String,Object> resultMap=new HashMap<String, Object>();
        List<Map<String,Object>> listResult=new ArrayList<Map<String, Object>>();
        Map<String,Object> firstMap=new HashMap<String, Object>();
        Map<String,Object> secondMap=new HashMap<String, Object>();
        if(listFirst.size()>0){
            for (Appmenu menu:listFirst) {
                List<Map<String,Object>> secondResult=new ArrayList<Map<String, Object>>();
                firstMap=new HashMap<String, Object>();
                firstMap.put("id",menu.getMenuId());
                firstMap.put("title",menu.getMenuName());
                firstMap.put("icon",menu.getMenuIcon());
                firstMap.put("href",menu.getMenuUrl());
                firstMap.put("isParent",menu.getIsParent());
                firstMap.put("spread",false);
                List<Appmenu> secondList=appuserService.getMenuListByUser(roleId,menu.getMenuId());
                if(secondList.size()>0){
                    for (Appmenu secondMenu:secondList ) {
                        secondMap=new HashMap<String, Object>();
                        secondMap.put("id",secondMenu.getMenuId());
                        secondMap.put("title",secondMenu.getMenuName());
                        secondMap.put("icon",secondMenu.getMenuIcon());
                        secondMap.put("href",secondMenu.getMenuUrl());
                        secondMap.put("isParent",secondMenu.getIsParent());
                        secondMap.put("spread",false);
                        secondResult.add(secondMap);
                    }
                    firstMap.put("children",secondResult);
                }
                listResult.add(firstMap); //添加第一层菜单
            }
            resultMap.put("success",1);
            resultMap.put("data",listResult);
        }else{
            resultMap.put("success", 0);
            resultMap.put("data", null);
            resultMap.put("error", "未获取到菜单数据");
        }
        return resultMap;
    }
}
