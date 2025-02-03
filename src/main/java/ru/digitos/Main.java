package ru.digitos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new DebitAccount("Ivanov Ivan"));
        bankAccounts.add(new CreditAccount("Petrov Petr"));
        bankAccounts.add(new SavingsAccount("Sidorov Sidor"));
        TransactionProcessor transactionProcessor = new TransactionProcessor();
        transactionProcessor.processTransaction(bankAccounts, 1000);
        transactionProcessor.processTransaction(bankAccounts, 2000);
        transactionProcessor.processTransaction(bankAccounts, 5000);
        System.out.println(bankAccounts.get(0).getBalance());
        System.out.println(bankAccounts.get(1).getBalance());
        System.out.println(bankAccounts.get(2).getBalance());
    }
}
