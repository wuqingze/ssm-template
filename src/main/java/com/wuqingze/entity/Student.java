package com.wuqingze.entity;

/**
 * Created by wuqingze on 2018/6/11.
 */
public class Student {
//    private String s_id;
    private String studentId;
    private String name;
    private String password;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    //    public String getS_id() {
//        return s_id;
//    }
//
//    public void setS_id(String s_id) {
//        this.s_id = s_id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
