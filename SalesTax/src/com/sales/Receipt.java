package com.sales;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Receipt {
    private List<Item> items;
    private BigDecimal totalSalesTax;
    private BigDecimal totalCost;

    public Receipt() {
        this.items = new ArrayList<>();
        this.totalSalesTax = BigDecimal.ZERO;
        this.totalCost = BigDecimal.ZERO;
    }

    public void addItem(Item item, BigDecimal tax) {
        BigDecimal totalPrice = item.getPrice().add(tax);
        items.add(item);
        totalSalesTax = totalSalesTax.add(tax);
        totalCost = totalCost.add(totalPrice);
    }

    public void printReceipt() {
        for (Item item : items) {
            BigDecimal tax = TaxCalculator.calculateTax(item);
            BigDecimal totalPrice = item.getPrice().add(tax);
            System.out.printf("%s: %.2f%n", item.getName(), totalPrice);
        }
        System.out.printf("Sales Taxes: %.2f%n", totalSalesTax);
        System.out.printf("Total: %.2f%n", totalCost);
    }
}