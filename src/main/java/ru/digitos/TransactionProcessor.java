package ru.digitos;

import java.util.List;

public class TransactionProcessor {
    void processTransaction(List<BankAccount> accounts, double amount) {
        for (BankAccount account : accounts) {
            account.withdraw(amount);
        }
    }
}
