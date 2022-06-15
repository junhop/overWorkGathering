package com.overWorkGathering.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    throws Exception{
        System.out.println("#Interceptor PreHandle Method Req URI : " + request.getRequestURI());
        HttpSession session = request.getSession();
        Object sessionId = session.getAttribute("ID");
        System.out.println("sessionId >>>>> " + sessionId);
		/*
		 * if(sessionId == null){ response.sendRedirect("/login"); return false; }
		 */

        //request.getSession().get
        // 인증여부 판단후 페이지이동 로직
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
    throws  Exception{


    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
    throws  Exception{

    }
}
