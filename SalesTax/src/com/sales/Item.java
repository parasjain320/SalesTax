package com.sales;

import java.math.BigDecimal;


class Item {
    private String name;
    private BigDecimal price;
    private boolean isExempt;
    private boolean isImported;

    public Item(String name, BigDecimal price, boolean isExempt, boolean isImported) {
        this.name = name;
        this.price = price;
        this.isExempt = isExempt;
        this.isImported = isImported;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isExempt() {
        return isExempt;
    }

    public boolean isImported() {
        return isImported;
    }
}
