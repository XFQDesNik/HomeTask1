package ru.digitos;

public abstract class BankAccount extends TransactionProcessor {
    private int accountNumber;
    private double balance;
    private String accountHolder;

    abstract void withdraw(double amount);

    void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public BankAccount(String aHolder) {
        ++accountNumber;
        accountHolder = aHolder;
        balance = 0;
    }

}
