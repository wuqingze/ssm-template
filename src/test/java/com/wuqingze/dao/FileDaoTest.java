package com.wuqingze.dao;

import com.wuqingze.BaseTest;
import com.wuqingze.entity.File;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wuqingze on 2018/7/1.
 */
public class FileDaoTest extends BaseTest{

    @Autowired
    private FileDao fileDao;

    @Test
    public void insert(){
        File file = new File();
        file.setFile_id(2323);
        file.setFile_name("helloworld.txt");
        file.setPath("/hello");
        System.out.println(String.format("modify item is: %d",fileDao.insert(file)));
//        fileDao.insert(file);

//        System.out.println(fileDao == null);
    }

    @Test
    public void queryByFileID(){
        File f = fileDao.queryByFileID(1);
        System.out.println(f);
    }

    @Test
    public void hashcode(){
        System.out.println("hello world".hashCode());
    }
}
