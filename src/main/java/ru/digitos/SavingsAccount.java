package ru.digitos;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.util.Date;

public class SavingsAccount extends BankAccount implements InterestBearing{
    @Override
    public void applyInterest() {
        double percent = 1.0;
        Date date = new Date();
        int dayOfMonth = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfMonth();

        if (getBalance().compareTo(BigDecimal.valueOf(0.0)) > 0 && dayOfMonth == 1)
            deposit(getBalance().multiply(BigDecimal.valueOf(percent)).divide(BigDecimal.valueOf(100.0)).add(getBalance()));
    }

    @Override
    void withdraw(BigDecimal amount) {

    }
    public SavingsAccount(String aHolder) {
        super(aHolder);
    }
}
