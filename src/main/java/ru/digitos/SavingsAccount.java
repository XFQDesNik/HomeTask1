package ru.digitos;

import java.time.ZoneId;
import java.util.Date;

public class SavingsAccount extends BankAccount implements InterestBearing {
    public SavingsAccount(String aHolder) {
        super(aHolder);
    }

    @Override
    public void applyInterest() {
        double percent = 1;
        Date date = new Date();
        int dayOfMonth = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfMonth();

        if (getBalance() > 0 && dayOfMonth == 1)
            setBalance(getBalance() + getBalance() * percent / 100);
    }

    @Override
    void withdraw(double amount) {
    }


}
