package service;

import model.Account;

import java.math.BigDecimal;
import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(Long id);
    Account createAccount(String name, BigDecimal initialBalance);
    void updateAccount(Long id, String name, BigDecimal initialBalance);
    void deleteAccount(Long id);
}
