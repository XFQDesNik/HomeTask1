package ru.digitos;

public class DebitAccount extends BankAccount implements TransactionValidator {

    public DebitAccount(String aHolder) {
        super(aHolder);
    }

    @Override
    void withdraw(double amount) {
        if (getBalance() >= amount && validate(amount)) {
            setBalance(getBalance() - amount);
        }
    }

    @Override
    public boolean validate(double amount) {
        return amount > 10000 ? false : true;
    }
}
