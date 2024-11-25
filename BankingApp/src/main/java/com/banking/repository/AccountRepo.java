package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Account;

import jakarta.transaction.Transactional;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
Account findByaccountnumber(String accountnumber);
@Transactional
Account deleteByaccountnumber(String accountnumber);
}
