package com.wybosoft.msbanking.repositories;

import com.wybosoft.msbanking.models.BankAccount;

public interface BankAccountRepository {
    BankAccount findByAccountNumber(String accountNumber);

    void save(BankAccount bankAccount);

    void deposit(String accountNumber, double amount);

    void withdraw(String accountNumber, double amount);
}
