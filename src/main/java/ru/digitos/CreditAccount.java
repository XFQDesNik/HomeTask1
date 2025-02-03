package ru.digitos;

public class CreditAccount extends BankAccount implements TransactionFee{


    public CreditAccount(String aHolder) {
        super(aHolder);
    }

    @Override
    void withdraw(double amount) {
        double creditLimit = -5000;
        if (getBalance()-amount >= creditLimit)
        {
            setBalance(getBalance()-amount);
            applyFee(amount);
        }
    }

    @Override
    public void applyFee(double amount) {
        double commission = 1;
        setBalance(getBalance()-(amount * commission/100));
    }
}
