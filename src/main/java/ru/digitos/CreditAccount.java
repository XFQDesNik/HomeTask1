package ru.digitos;

import java.math.BigDecimal;

public class CreditAccount extends BankAccount implements TransactionFee, TransactionValidator {
    @Override
    void withdraw(BigDecimal amount) {
        BigDecimal creditLimit = BigDecimal.valueOf(5000);
        if (validate(amount) && amount.compareTo(BigDecimal.valueOf(0)) > 0) {
            if (getBalance().add(creditLimit).compareTo(amount) >= 0) {
                BigDecimal balance = getBalance().subtract(amount);
                applyFee(amount);
                setBalance(balance);
            }
        }
    }

    @Override
    public void applyFee(BigDecimal amount) {
        double commission = 1.0;
        setBalance(getBalance().multiply(amount.add(amount.multiply(BigDecimal.valueOf(commission / 100)))));
    }

    public CreditAccount(String aHolder) {
        super(aHolder);
    }

    @Override
    public boolean validate(BigDecimal amount) {
        return amount.compareTo(BigDecimal.valueOf(5000)) <= 0;
    }
}
