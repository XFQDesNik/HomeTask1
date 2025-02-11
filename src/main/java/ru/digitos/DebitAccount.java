package ru.digitos;

import java.math.BigDecimal;

public class DebitAccount extends BankAccount  implements TransactionValidator{
    @Override
    void withdraw(BigDecimal amount) {
        if (validate(amount)) {
            if (getBalance().compareTo(amount) >= 0) {
                setBalance(getBalance().subtract(amount));
            }
        }
    }
    public DebitAccount(String aHolder) {
        super(aHolder);
    }

    @Override
    public boolean validate(BigDecimal amount) {
        return amount.compareTo(BigDecimal.valueOf(10000)) <= 0;
    }
}
