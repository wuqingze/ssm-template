package com.wuqingze.exception;

/**
 * Created by wuqingze on 2018/6/9.
 */
public class NoNumberException extends RuntimeException {

    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }

}