package com.zup.account.bank.demo.exception;

import org.springframework.http.HttpStatus;

public class AccountRequestException extends RuntimeException{

    private final HttpStatus httpStatus;

    public AccountRequestException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public AccountRequestException(String message, Throwable cause, HttpStatus httpStatus) {
        super(message, cause);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
