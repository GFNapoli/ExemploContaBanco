package com.zup.account.bank.demo.entitie;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "account")
@SequenceGenerator(name = "account_seq", sequenceName = "account_seq", allocationSize = 1)
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq")
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "mail")
    private String mail;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "creat_at")
    private LocalDateTime creatAt;
    @Column(name = "update_at")
    private LocalDateTime updateAt;

    public Account(Long id, String name, String cpf, String mail, LocalDate dateOfBirth, LocalDateTime creatAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.mail = mail;
        this.dateOfBirth = dateOfBirth;
        this.creatAt = creatAt;
        this.updateAt = updateAt;
    }

    public Account() {
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

    public LocalDateTime getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(LocalDateTime creatAt) {
        this.creatAt = creatAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
