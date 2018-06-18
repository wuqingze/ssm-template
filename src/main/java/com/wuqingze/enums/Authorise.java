package com.wuqingze.enums;

/**
 * Created by wuqingze on 2018/6/12.
 */
public class Authorise {
    Boolean authorise;

    public Boolean getAuthorise() {
        return authorise;
    }

    public void setAuthorise(Boolean authorise) {
        this.authorise = authorise;
    }

    public Authorise(Boolean authorise) {
        this.authorise = authorise;
    }

    @Override
    public String toString() {
        return "Authorise{" +
                "authorise=" + authorise +
                '}';
    }
}
