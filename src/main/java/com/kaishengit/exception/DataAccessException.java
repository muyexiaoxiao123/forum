package com.kaishengit.exception;

/**
 * Created by Administrator on 2016/4/8.
 */
public class DataAccessException extends RuntimeException{
    private static final long serialVersionUID = 5227803783619562547L;

    public DataAccessException(){}

    public DataAccessException(Throwable th) {
        super(th);
    }

    public DataAccessException(Throwable th,String message) {
        super(message,th);
    }

}
