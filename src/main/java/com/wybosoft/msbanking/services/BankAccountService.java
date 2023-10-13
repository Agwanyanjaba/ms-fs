package com.wybosoft.msbanking.services;

import com.wybosoft.msbanking.models.BankAccount;

public interface BankAccountService {
    BankAccount createBankAccount(String accountNumber, Double initialBalance);
    BankAccount getBankAccount(Long id);
    BankAccount deposit(Long id, Double amount);
}
