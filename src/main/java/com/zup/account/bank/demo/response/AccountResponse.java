package com.zup.account.bank.demo.response;

import java.time.LocalDate;

public class AccountResponse {
    private Long id;
    private String name;
    private String cpf;
    private String mail;
    private LocalDate dateOfBirth;

    public AccountResponse(Long id, String name, String cpf, String mail, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.mail = mail;
        this.dateOfBirth = dateOfBirth;
    }

    public AccountResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
