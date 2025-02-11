package ru.digitos;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void mainTest() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new DebitAccount("Ivanov Ivan"));
        bankAccounts.add(new CreditAccount("Petrov Petr"));
        bankAccounts.add(new SavingsAccount("Sidorov Sidor"));


        bankAccounts.get(0).deposit(BigDecimal.valueOf(5000));
        bankAccounts.get(1).deposit(BigDecimal.valueOf(500));
        bankAccounts.get(2).deposit(BigDecimal.valueOf(2000));

        TransactionProcessor transactionProcessor = new TransactionProcessor();
        transactionProcessor.processTransaction(bankAccounts, BigDecimal.valueOf(5000.0));
        transactionProcessor.processTransaction(bankAccounts, BigDecimal.valueOf(5000.0));
        transactionProcessor.processTransaction(bankAccounts, BigDecimal.valueOf(1500.0));

        assertEquals(1, bankAccounts.get(0).getAccountNumber());
        assertEquals(2, bankAccounts.get(1).getAccountNumber());
        assertEquals(3, bankAccounts.get(2).getAccountNumber());
        assertEquals("Ivanov Ivan", bankAccounts.get(0).getAccountHolder());
        assertEquals("Petrov Petr", bankAccounts.get(1).getAccountHolder());
        assertEquals("Sidorov Sidor", bankAccounts.get(2).getAccountHolder());
        assertEquals(BigDecimal.valueOf(0.0), bankAccounts.get(0).getBalance());
        assertEquals(BigDecimal.valueOf(-4500.0), bankAccounts.get(1).getBalance());
        assertEquals(BigDecimal.valueOf(500.0), bankAccounts.get(2).getBalance());
    }
}