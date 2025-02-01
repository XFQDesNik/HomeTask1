package ru.digitos;

public class DebitAccount extends BankAccount{

    @Override
    double withdraw(double amount) {
        if (getBalance()>=amount){
            setBalance(getBalance()-amount);
            return amount;
        }
        else return 0;
    }

    @Override
    double deposit(double amount) {
        return 0;
    }
}
