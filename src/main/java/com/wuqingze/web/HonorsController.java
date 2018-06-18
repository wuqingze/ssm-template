package com.wuqingze.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuqingze.dao.HonorDao;
import com.wuqingze.entity.Honor;
import com.wuqingze.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by wuqingze on 2018/6/18.
 */
@Controller
@RequestMapping("/honors")
public class HonorsController {

    @Autowired
    HonorDao honorDao;

    @RequestMapping("/queryByPName")
    public void queryByPName(HttpServletRequest request,PrintWriter pw, String pName) throws JsonProcessingException {
        Student s = (Student)request.getSession().getAttribute("user");
        List<Honor> result =  honorDao.queryByPNameAndSid(pName,s.getStudentId());
//        System.out.println(pName);
//        System.out.println(s);
//        System.out.println(new ObjectMapper().writeValueAsString(result));
        pw.write(new ObjectMapper().writeValueAsString(result));
    }
}
