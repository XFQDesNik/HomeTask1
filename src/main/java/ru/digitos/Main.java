package ru.digitos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new DebitAccount("Ivanov Ivan"));
        bankAccounts.add(new CreditAccount("Petrov Petr"));
        bankAccounts.add(new SavingsAccount("Sidorov Sidor"));


        bankAccounts.get(0).deposit(BigDecimal.valueOf(5000));
        bankAccounts.get(1).deposit(BigDecimal.valueOf(5000));
        bankAccounts.get(2).deposit(BigDecimal.valueOf(5000));

        TransactionProcessor transactionProcessor = new TransactionProcessor();
        transactionProcessor.processTransaction(bankAccounts, BigDecimal.valueOf(1000.0));
        transactionProcessor.processTransaction(bankAccounts, BigDecimal.valueOf(2000.0));
        transactionProcessor.processTransaction(bankAccounts, BigDecimal.valueOf(5000.0));

        System.out.println(bankAccounts.get(0).getAccountNumber() + " "
        + bankAccounts.get(0).getAccountHolder() + " "
        + bankAccounts.get(0).getBalance());
        System.out.println(bankAccounts.get(1).getAccountNumber() + " "
                + bankAccounts.get(1).getAccountHolder() + " "
                + bankAccounts.get(1).getBalance());
        System.out.println(bankAccounts.get(2).getAccountNumber() + " "
                + bankAccounts.get(2).getAccountHolder() + " "
                + bankAccounts.get(2).getBalance());
    }
}
