package ru.digitos;

public class DebitAccount extends BankAccount{

    public DebitAccount(String aHolder) {
        super(aHolder);
    }

    @Override
    void withdraw(double amount) {
        if (getBalance()>=amount){
            setBalance(getBalance()-amount);
        }
    }
}
