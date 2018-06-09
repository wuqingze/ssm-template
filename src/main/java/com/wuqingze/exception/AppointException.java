package com.wuqingze.exception;

/**
 * Created by wuqingze on 2018/6/9.
 */
public class AppointException extends RuntimeException {

    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }

}