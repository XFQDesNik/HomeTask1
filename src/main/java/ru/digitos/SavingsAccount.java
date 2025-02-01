package ru.digitos;

public class SavingsAccount extends BankAccount implements InterestBearing{
    @Override
    public void applyInterest() {
double percent = 1;
        if (getBalance() < 0)
           setBalance(getBalance()+getBalance()*percent/100 );
    }

    @Override
    double withdraw(double amount) {
        return 0;
    }

    @Override
    double deposit(double amount) {
        return 0;
    }
}
