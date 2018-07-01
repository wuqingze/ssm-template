package com.wuqingze.dao;

import com.wuqingze.entity.File;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wuqingze on 2018/7/1.
 */
public interface FileDao {
    File queryByFileID(@Param("file_id")int file_id);

    int insert(File file);
}
