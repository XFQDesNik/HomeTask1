package ru.digitos;

import java.math.BigDecimal;

public interface TransactionFee {
    public void applyFee(BigDecimal amount);
}
