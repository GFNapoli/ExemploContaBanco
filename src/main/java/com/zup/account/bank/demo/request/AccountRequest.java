package com.zup.account.bank.demo.request;

import java.time.LocalDate;

public class AccountRequest {
    private String name;
    private String cpf;
    private String mail;
    private LocalDate dateOfBirth;

    public AccountRequest(String name, String cpf, String mail, LocalDate dateOfBirth) {
        this.name = name;
        this.cpf = cpf;
        this.mail = mail;
        this.dateOfBirth = dateOfBirth;
    }

    public AccountRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
