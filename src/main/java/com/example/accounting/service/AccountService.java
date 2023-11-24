package com.example.accounting.service;

import com.example.accounting.model.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(Long id);
    Account createAccount(String name, BigDecimal initialBalance);
    void updateAccount(Long id, String name, BigDecimal initialBalance);
    void deleteAccount(Long id);
}