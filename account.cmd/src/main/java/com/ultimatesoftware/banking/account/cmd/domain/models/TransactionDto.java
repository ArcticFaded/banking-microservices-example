package com.ultimatesoftware.banking.account.cmd.domain.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionDto {
    @NotNull
    private String id;
    @NotNull
    private UUID account;
    @NotNull
    private UUID customerId;
    @Min(1)
    private double amount;
    private UUID destinationAccount;

    public TransactionDto() {
    }

    public TransactionDto(UUID account, UUID customerId, double amount, UUID destinationAccount) {
        this.account = account;
        this.customerId = customerId;
        this.amount = amount;
        this.destinationAccount = destinationAccount;
    }

    public String getId() {
        return id;
    }

    public UUID getDestinationAccount() {
        return destinationAccount;
    }

    public UUID getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "id=" + id +
                ", account=" + account +
                ", customerId=" + customerId +
                ", amount=" + amount +
                ", destinationAccount=" + destinationAccount +
                '}';
    }
}
