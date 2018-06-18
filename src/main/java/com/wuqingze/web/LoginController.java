package com.wuqingze.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuqingze.dao.StudentDao;
import com.wuqingze.entity.Student;
import com.wuqingze.enums.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;

/**
 * Created by wuqingze on 2018/6/17.
 */
@Controller
public class LoginController {

    @Autowired
    StudentDao studentDao;


    @RequestMapping("/userlogin")
    public void userlogin(HttpServletRequest request, PrintWriter pw, String s_id, String password) throws JsonProcessingException {
        Student s = studentDao.queryById(s_id);
        if(s != null && s.getPassword().equals(password)){
            request.getSession().setAttribute("user",s);
            pw.write(new ObjectMapper().writeValueAsString(new LoginResult(true)));
            return;
        }

        pw.write(new ObjectMapper().writeValueAsString(new LoginResult(false)));
    }
}
