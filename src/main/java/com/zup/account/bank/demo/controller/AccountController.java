package com.zup.account.bank.demo.controller;

import com.zup.account.bank.demo.request.AccountRequest;
import com.zup.account.bank.demo.response.AccountResponse;
import com.zup.account.bank.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountResponse> create(@RequestBody AccountRequest accountRequest){
        return new ResponseEntity<>(accountService.create(accountRequest), HttpStatus.CREATED);
    }
}
