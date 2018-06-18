package com.wuqingze.entity;

/**
 * Created by wuqingze on 2018/6/11.
 */
public class File {
    private Integer file_id;
    private String path;
    private String file_name;

    public Integer getFile_id() {
        return file_id;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }
}
