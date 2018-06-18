package com.wuqingze.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Created by wuqingze on 2018/6/17.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/sessionid")
    public void sessionid(HttpServletRequest request, HttpServletResponse response, PrintWriter pw){
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
//        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");


        String origin = request.getHeader("Origin");
//        response.setHeader("Access-Control-Allow-Origin", origin);
//        response.setHeader("Vary", "Origin");
//
//        // Access-Control-Max-Age
//        response.setHeader("Access-Control-Max-Age", "3600");
//
//        // Access-Control-Allow-Credentials
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//
//        // Access-Control-Allow-Methods
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//
//        // Access-Control-Allow-Headers
//        response.setHeader("Access-Control-Allow-Headers",
//                "Origin, X-Requested-With, Content-Type, Accept, " + "X-CSRF-TOKEN");

        System.out.println("-----------------");
        System.out.println(request.getServletPath());
        System.out.println(origin);
        System.out.println(request.getSession().getId());
        pw.write(request.getSession().getId());
    }
}
