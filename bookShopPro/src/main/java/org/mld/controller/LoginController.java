package org.mld.controller;

import org.mld.po.Appuser;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author mld
 */
@Controller
public class LoginController {
    @Autowired
    private AppuserService appuserService;
    public String index(HttpSession session){
        if(session.getAttribute("user")!=null){
            return "redirect:"+session.getAttribute("requestParentPath");
        }else{
            return "redirect:login/login";
        }
    }
    @RequestMapping(value = "/login")
    public String login(String username,String password,HttpSession session){
        Appuser appuser=appuserService.checkLogin(username,password);
       if(appuser!=null){
           session.setAttribute("user",appuser);
          return "login/index";
       }else{
           return "login/login";
       }
    }
}
