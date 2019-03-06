package org.mld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @RequestMapping(value = "/toView")
    public ModelAndView index(String pindex,Integer id){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("id",id);
        modelAndView.setViewName("/admin/"+pindex);
        return modelAndView;
    }
}
