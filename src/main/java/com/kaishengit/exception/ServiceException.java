package com.kaishengit.exception;

/**
 * Created by Administrator on 2016/4/13.
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = 5227803783619562547L;

    public ServiceException(){}

    public ServiceException(String msg) {
        super(msg);
    }

    public ServiceException(Throwable th) {
        super(th);
    }

    public ServiceException(Throwable th, String message) {
        super(message,th);
    }
}
