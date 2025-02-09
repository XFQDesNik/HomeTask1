package ru.digitos;

import java.math.BigDecimal;
import java.util.List;

public class TransactionProcessor {
    void processTransaction(List<BankAccount> accounts, BigDecimal amount){
        for (BankAccount account : accounts) {
            account.withdraw(amount);
        }
    }
}
