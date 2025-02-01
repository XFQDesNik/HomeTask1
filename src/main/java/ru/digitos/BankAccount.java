package ru.digitos;

public abstract class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolder;
    abstract double withdraw(double amount);
    abstract double deposit(double amount);

    public double getBalance() {
        return balance;
    }
    public void setBalance(double amount){
        this.balance = amount;
    }
}
