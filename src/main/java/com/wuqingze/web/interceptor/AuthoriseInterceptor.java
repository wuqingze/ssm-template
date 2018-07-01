package com.wuqingze.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wuqingze on 2018/7/1.
 */
public class AuthoriseInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("authorise interceptor");
        System.out.println(String.format("request context path is %s",request.getContextPath()));
        System.out.println(String.format("request path info: %s",request.getPathInfo()));
        System.out.println(String.format("uri: %s",request.getRequestURI()));
        if(request.getRequestURI().contains("login")) return true;
        if(request.getRequestURI().contains("authorise")) return true;
        if(request.getRequestURI().contains("test")) return true;

        return request.getSession().getAttribute("user") != null;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
