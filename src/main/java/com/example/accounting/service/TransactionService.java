package com.example.accounting.service;

import com.example.accounting.model.Account;
import com.example.accounting.model.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

@Service
public interface TransactionService {
    List<Transaction> getTransactionsByAccountAndMonth(Account account, YearMonth month);
    Transaction addTransaction(Long accountId, BigDecimal amount, String comment, LocalDate date);
    void updateTransaction(Long id, BigDecimal amount, String comment, LocalDate date);
    void deleteTransaction(Long id);
}