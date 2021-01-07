package com.zup.account.bank.demo.service;

import com.zup.account.bank.demo.entitie.Account;
import com.zup.account.bank.demo.repository.AccountRepository;
import com.zup.account.bank.demo.request.AccountRequest;
import com.zup.account.bank.demo.response.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountResponse create(AccountRequest accountRequest){
        if(accountRepository.findByCpf(accountRequest.getCpf()) != null){
            throw new RuntimeException("CPF already exists in the database");
        }
        if(accountRepository.findByMail(accountRequest.getMail()) != null){
            throw new RuntimeException("E-mail already exists in the database");
        }

        Account account = new Account();
        account.setCpf(accountRequest.getCpf());
        account.setName(accountRequest.getName());
        account.setMail(accountRequest.getMail());
        account.setDateOfBirth(accountRequest.getDateOfBirth());
        account.setCreatAt(LocalDateTime.now());

        accountRepository.saveAndFlush(account);

        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setCpf(account.getCpf());
        accountResponse.setName(account.getName());
        accountResponse.setMail(account.getMail());
        accountResponse.setDateOfBirth(account.getDateOfBirth());
        accountResponse.setId(account.getId());

        return accountResponse;
    }
}
