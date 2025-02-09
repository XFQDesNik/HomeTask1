package ru.digitos;

import java.math.BigDecimal;

public class CreditAccount extends BankAccount implements TransactionFee, TransactionValidator {
    @Override
    void withdraw(BigDecimal amount) {
        BigDecimal creditLimit = BigDecimal.valueOf(-5000);
        if (getBalance().add(creditLimit).compareTo(amount) > 0 || getBalance().add(creditLimit).compareTo(amount) == 0){
            deposit(getBalance().subtract(amount));
        }
    }

    @Override
    public void applyFee(BigDecimal amount) {
        double commission = 1.0;
        deposit(getBalance().multiply(amount.add(amount.multiply(BigDecimal.valueOf(commission)))));
    }
    public CreditAccount(String aHolder) {
        super(aHolder);
    }

    @Override
    public boolean validate(BigDecimal amount) {
        return amount.compareTo(BigDecimal.valueOf(5000)) <= 0;
    }
}
