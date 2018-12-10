package org.mld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mld
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/toView")
    public String index(String pindex){
        return "admin/"+pindex;
    }
    @RequestMapping(value = "/testUser")
    public String indexTest(){
        return "/admin/userList";
    }
}
