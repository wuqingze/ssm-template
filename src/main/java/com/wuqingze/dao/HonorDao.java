package com.wuqingze.dao;

import com.wuqingze.entity.Honor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wuqingze on 2018/6/11.
 */
public interface HonorDao {

    Honor queryById(@Param("h_id") String h_id);

    List<Honor> queryByPName(@Param("pName") String pName);

    List<Honor> queryByPNameAndSid(@Param("pName") String pName, @Param("sID") String sID);

    int insert(Honor honor);
}
