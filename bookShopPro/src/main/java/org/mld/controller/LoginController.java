package org.mld.controller;

import org.mld.po.Appuser;
import org.mld.services.AppuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
