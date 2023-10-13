package com.wybosoft.msbanking.models;

import jakarta.persistence.*;

@Entity
public class  BankAccount {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;
    private double balance;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
