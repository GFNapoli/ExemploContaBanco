package com.zup.account.bank.demo.repository;

import com.zup.account.bank.demo.entitie.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

    Account findByMail(String mail);

    Account findByCpf(String cpf);
}
