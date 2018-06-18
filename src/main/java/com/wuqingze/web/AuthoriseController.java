package com.wuqingze.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuqingze.enums.Authorise;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;

/**
 * Created by wuqingze on 2018/6/17.
 */
@Controller
public class AuthoriseController {
    @RequestMapping("/authorise")
    public void authorise(PrintWriter pw, HttpServletRequest request) throws JsonProcessingException {
        if((request.getSession().getAttribute("user")!=null)){
            pw.write(new ObjectMapper().writeValueAsString(new Authorise(true)));
            return;
        }
        pw.write(new ObjectMapper().writeValueAsString(new Authorise(false)));
    }
}
