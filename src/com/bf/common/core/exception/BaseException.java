package com.bf.common.core.exception;

/**
 * 基本普通异常类
 * Created by mateng on 2014/10/16.
 */
public class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Exception exception) {
        super(message, exception);
    }

}
