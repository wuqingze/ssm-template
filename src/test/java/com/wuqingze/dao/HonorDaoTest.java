package com.wuqingze.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuqingze.entity.Honor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.wuqingze.BaseTest;

import java.util.List;

/**
 * Created by wuqingze on 2018/6/11.
 */
public class HonorDaoTest extends BaseTest{
    @Autowired
    private HonorDao honorDao;

    @Test
    public void queryById(){
        String h_id = "0.9973613666072085";
        Honor honor = honorDao.queryById(h_id);
        System.out.println(honor);
    }

    @Test
    public void queryByIdAndSid(){
        List<Honor> l = honorDao.queryByPNameAndSid("shjxx","10152510231");
        System.out.println(l.size());
    }

    @Test
    public void queryByPName() throws JsonProcessingException {
        List<Honor> l = honorDao.queryByPName("shjxx");
        System.out.println(new ObjectMapper().writeValueAsString(l));
    }
}
