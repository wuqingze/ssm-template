package com.wuqingze.dao;

import com.wuqingze.entity.Student;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wuqingze on 2018/6/11.
 */
public interface StudentDao {

    /**
     * @param s_id
     * @return
     */
    Student queryById(String s_id);

}
