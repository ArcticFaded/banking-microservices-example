package com.ultimatesoftware.banking.account.query.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import java.util.UUID;

public class Account {
    @NotNull
    @Id
    private String id;
    @NotNull
    @Indexed
    private UUID accountId;
    @Min(18)
    private UUID customerId;
    private double balance;

    public Account(UUID accountId, UUID customerId, double balance) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.balance = balance;
    }

    public Account() {
    }

    public UUID getId() {
        return accountId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
