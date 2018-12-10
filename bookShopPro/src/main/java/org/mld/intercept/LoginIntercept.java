package org.mld.intercept;


import org.apache.log4j.Appender;
import org.mld.po.Appuser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginIntercept implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI=request.getRequestURI();
        if(!"/checkLogin".equals(requestURI) && !"/login".equals(requestURI) && !"/view/login/login.jsp".equals(requestURI)){     //不是访问登录界面的请求
            Appuser appuser=(Appuser)request.getSession().getAttribute("appuser");
            if(appuser!=null){
                return true;
            }else{
                request.getRequestDispatcher("/login").forward(request,response);
                return false;
            }
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
