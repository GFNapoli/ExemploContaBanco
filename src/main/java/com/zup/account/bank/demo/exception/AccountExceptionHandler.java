package com.zup.account.bank.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AccountExceptionHandler {

    @ExceptionHandler(value = {AccountRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(AccountRequestException e) {
        //Payload
        AccountException accountException = new AccountException(
                e.getMessage(),
                e.getHttpStatus()
        );
        return new ResponseEntity<>(accountException, e.getHttpStatus());
    }
}

