package ru.digitos;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void withdraw() {
        BigDecimal amount = new BigDecimal("2000.0");
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new DebitAccount("Ivanov Ivan"));
        bankAccounts.add(new CreditAccount("Petrov Petr"));
        bankAccounts.add(new SavingsAccount("Sidorov Sidor"));
        bankAccounts.get(0).deposit(BigDecimal.valueOf(5000));
        bankAccounts.get(1).deposit(BigDecimal.valueOf(500));
        bankAccounts.get(2).deposit(BigDecimal.valueOf(2000));
        bankAccounts.get(0).withdraw(amount);
        bankAccounts.get(1).withdraw(amount);
        bankAccounts.get(2).withdraw(amount);
        assertEquals(BigDecimal.valueOf(3000.0), bankAccounts.get(0).getBalance());
        assertEquals(BigDecimal.valueOf(-1500.0), bankAccounts.get(1).getBalance());
        assertEquals(BigDecimal.valueOf(0.0), bankAccounts.get(2).getBalance());
    }

    @Test
    public void deposit() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new DebitAccount("Ivanov Ivan"));
        bankAccounts.add(new CreditAccount("Petrov Petr"));
        bankAccounts.add(new SavingsAccount("Sidorov Sidor"));
        bankAccounts.get(0).deposit(BigDecimal.valueOf(5000));
        bankAccounts.get(1).deposit(BigDecimal.valueOf(500));
        bankAccounts.get(2).deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(5000.0), bankAccounts.get(0).getBalance());
        assertEquals(BigDecimal.valueOf(500.0), bankAccounts.get(1).getBalance());
        assertEquals(BigDecimal.valueOf(2000.0), bankAccounts.get(2).getBalance());
    }
}