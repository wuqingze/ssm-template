package com.wuqingze.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Date;

/**
 * Created by wuqingze on 2018/6/11.
 */
public class Honor {
    private String h_id;
    private String p_name;
    private String s_id;
    private String theme;
    private String introduction;
    private String explanation;
    private Boolean checked;
    private String t_id;
    private Integer file_id;
    private Date time;

    public String getH_id() {
        return h_id;
    }

    public void setH_id(String h_id) {
        this.h_id = h_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public Integer getFile_id() {
        return file_id;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Honor{" +
                "h_id='" + h_id + '\'' +
                ", p_name='" + p_name + '\'' +
                ", s_id='" + s_id + '\'' +
                ", theme='" + theme + '\'' +
                ", introduction='" + introduction + '\'' +
                ", explanation='" + explanation + '\'' +
                ", checked=" + checked +
                ", t_id='" + t_id + '\'' +
                ", file_id=" + file_id +
                ", time=" + time +
                '}';
    }
}
