package com.example.accounting.controllers;

import com.example.accounting.service.AccountService;
import com.example.accounting.service.TransactionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final AccountService accountService;
    private final TransactionService transactionService;

    public IndexController(AccountService accountService, TransactionService transactionService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
    }

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        // TODO
        return "index";
    }
}