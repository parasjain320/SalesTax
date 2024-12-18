package com.sales;

import java.math.BigDecimal;

public class SalesTaxApplication {
    public static void main(String[] args) {
        // Input 1
        Receipt receipt1 = new Receipt();
        receipt1.addItem(new Item("book", new BigDecimal("12.49"), true, false), TaxCalculator.calculateTax(new Item("book", new BigDecimal("12.49"), true, false)));
        receipt1.addItem(new Item("music CD", new BigDecimal("14.99"), false, false), TaxCalculator.calculateTax(new Item("music CD", new BigDecimal("14.99"), false, false)));
        receipt1.addItem(new Item("chocolate bar", new BigDecimal("0.85"), true, false), TaxCalculator.calculateTax(new Item("chocolate bar", new BigDecimal("0.85"), true, false)));
        System.out.println("Output 1:");
        receipt1.printReceipt();

        //  Input 2
        Receipt receipt2 = new Receipt();
        receipt2.addItem(new Item("imported box of chocolates", new BigDecimal("10.00"), true, true), TaxCalculator.calculateTax(new Item("imported box of chocolates", new BigDecimal("10.00"), true, true)));
        receipt2.addItem(new Item("imported bottle of perfume", new BigDecimal("47.50"), false, true), TaxCalculator.calculateTax(new Item("imported bottle of perfume", new BigDecimal("47.50"), false, true)));
        System.out.println("\nOutput 2:");
        receipt2.printReceipt();

        //  Input 3
        Receipt receipt3 = new Receipt();
        receipt3.addItem(new Item("imported bottle of perfume", new BigDecimal("27.99"), false, true), TaxCalculator.calculateTax(new Item("imported bottle of perfume", new BigDecimal("27.99"), false, true)));
        receipt3.addItem(new Item("bottle of perfume", new BigDecimal("18.99"), false, false), TaxCalculator.calculateTax(new Item("bottle of perfume", new BigDecimal("18.99"), false, false)));
        receipt3.addItem(new Item("packet of headache pills", new BigDecimal("9.75"), true, false), TaxCalculator.calculateTax(new Item("packet of headache pills", new BigDecimal("9.75"), true, false)));
        receipt3.addItem(new Item("box of imported chocolates", new BigDecimal("11.25"), true, true), TaxCalculator.calculateTax(new Item("box of imported chocolates", new BigDecimal("11.25"), true, true)));
        System.out.println("\nOutput 3:");
        receipt3.printReceipt();
    }
}