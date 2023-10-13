package com.wybosoft.msbanking.services;

import com.wybosoft.msbanking.models.BankAccount;
import com.wybosoft.msbanking.repositories.BankAccountRepository;

import java.util.HashMap;
import java.util.Map;

public class BankAccountServiceImpl implements BankAccountRepository {

    private final Map<String, BankAccount> accounts = new HashMap<>();

    @Override
    public BankAccount findByAccountNumber(String accountNumber) {
        return accounts.get(accountNumber);
    }

    @Override
    public void save(BankAccount bankAccount) {
        accounts.put(bankAccount.getAccountNumber(), bankAccount);
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        BankAccount account = findByAccountNumber(accountNumber);
        if (account == null) {
            throw new RuntimeException("Account not found");
        }

        account.deposit(amount);
        save(account);
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        BankAccount account = findByAccountNumber(accountNumber);
        if (account == null) {
            throw new RuntimeException("Account not found");
        }

        account.withdraw(amount);
        save(account);
    }
}
