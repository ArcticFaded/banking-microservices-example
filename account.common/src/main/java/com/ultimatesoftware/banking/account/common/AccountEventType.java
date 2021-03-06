package com.ultimatesoftware.banking.account.common;

public enum AccountEventType {
    CREATED,
    CREDITED,
    DEBITED,
    DELETED,
    RELEASED,
    UPDATED,
    TRANSACTION_FAILED,
    TRANSFER_CANCELLED,
    TRANSFER_CONCLUDED,
    TRANSFER_FAILED_TO_START,
    TRANSFER_WITHDRAW_CONCLUDED,
    TRANSFER_DEPOSIT_CONCLUDED,
    TRANSACTION_STARTED
}
