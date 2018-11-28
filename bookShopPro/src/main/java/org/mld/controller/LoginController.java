package org.mld.controller;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

/**
 * @author mld
 */
@Controller
public class LoginController {
    public String index(HttpSession session){
        if(session.getAttribute("user")!=null){
            return "redirect:"+session.getAttribute("requestParentPath");
        }else{
            return "redirect:login/login";
        }
    }
}
