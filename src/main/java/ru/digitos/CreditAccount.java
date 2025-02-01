package ru.digitos;

public class CreditAccount extends BankAccount implements TransactionFee{


    @Override
    double withdraw(double amount) {

        double creditLimit = -5000;
        if (getBalance()-amount > creditLimit)
        {
            setBalance(getBalance()-amount);
            applyFee(amount);
            return amount;
        }
        return 0;
    }

    @Override
    double deposit(double amount) {
        return 0;
    }

    @Override
    public void applyFee(double amount) {
        double commission = 1;
        setBalance(getBalance()-(amount * commission /100));
    }
}
