package com.zup.account.bank.demo.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class AccountException {
    private final String message;
    private final HttpStatus httpStatus;


    public AccountException(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
