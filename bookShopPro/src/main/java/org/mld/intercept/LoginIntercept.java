package org.mld.intercept;

import org.mld.po.Appuser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginIntercept implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
            HttpSession session=request.getSession();
            Appuser appuser=(Appuser) session.getAttribute("appuser");
            if(appuser!=null){
                return true;
            }else{
                request.getRequestDispatcher("/login").forward(request,response);
                return false;
            }
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
