package ru.digitos;

import java.math.BigDecimal;

public abstract class BankAccount {
    private int accountNumber;
    private BigDecimal balance;
    private String accountHolder;
    private static int count = 1;

    abstract void withdraw(BigDecimal amount);

    public void deposit(BigDecimal amount){
        balance = balance.add(amount);
    }

    public BigDecimal getBalance(){
        return balance;
    }

    public void setBalance(BigDecimal amount){
        balance = amount;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public BankAccount(String aHolder) {
        accountNumber = count++;
        accountHolder = aHolder;
        balance = BigDecimal.valueOf(0.0);
    }
}
