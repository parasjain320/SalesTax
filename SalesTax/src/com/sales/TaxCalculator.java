package com.sales;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculator {
    private static final BigDecimal BASIC_SALES_TAX = new BigDecimal("0.10");
    private static final BigDecimal IMPORT_DUTY = new BigDecimal("0.05");

    public static BigDecimal calculateTax(Item item) {
        BigDecimal tax = BigDecimal.ZERO;

        if (!item.isExempt()) {
            tax = tax.add(item.getPrice().multiply(BASIC_SALES_TAX));
        }
        if (item.isImported()) {
            tax = tax.add(item.getPrice().multiply(IMPORT_DUTY));
        }

        // try to roundup upto 5 deci
        tax = roundUpToNearestFiveCents(tax);
        return tax;
    }

    private static BigDecimal roundUpToNearestFiveCents(BigDecimal amount) {
        return amount.divide(new BigDecimal("0.05"), 0, RoundingMode.UP).multiply(new BigDecimal("0.05"));
    }
}

