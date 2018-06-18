package com.wuqingze.web;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;

/**
 * Created by wuqingze on 2018/6/18.
 */
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("honors")
    public void honors(PrintWriter pw, HttpServletRequest request){

    }
}
