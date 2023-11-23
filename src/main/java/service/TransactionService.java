package service;

import model.Account;
import model.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

public interface TransactionService {
    List<Transaction> getTransactionsByAccountAndMonth(Account account, YearMonth month);
    Transaction addTransaction(Long accountId, BigDecimal amount, String comment, LocalDate date);
    void updateTransaction(Long id, BigDecimal amount, String comment, LocalDate date);
    void deleteTransaction(Long id);
}
