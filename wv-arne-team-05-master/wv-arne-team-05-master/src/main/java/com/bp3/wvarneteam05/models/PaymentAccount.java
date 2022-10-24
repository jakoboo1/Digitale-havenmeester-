package com.bp3.wvarneteam05.models;

public class PaymentAccount extends BankAccount{

private String accountNumber;

    public PaymentAccount(String firstname, String lastname, String accountNumber) {
        super(firstname, lastname);
        this.accountNumber = accountNumber;
    }
}
