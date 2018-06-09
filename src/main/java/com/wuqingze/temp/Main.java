package com.wuqingze.temp;

/**
 * Created by wuqingze on 2018/6/8.
 */
public class Main {
    public static void main(String[] argvs){
        String s  = Main.class.getResource("").getPath();
        System.out.println(s);
    }
}
