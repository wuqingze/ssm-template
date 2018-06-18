package com.wuqingze.dao;

import com.wuqingze.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.wuqingze.BaseTest;


/**
 * Created by wuqingze on 2018/6/11.
 */
public class StudentDaoTest extends BaseTest {

    @Autowired
    private StudentDao studentDao;

    @Test
    public void testQueryById() throws Exception {
        String s_id = "10152510231";
//        System.out.println(studentDao == null);
        Student s =  studentDao.queryById(s_id);
        System.out.println(s);
    }

}
