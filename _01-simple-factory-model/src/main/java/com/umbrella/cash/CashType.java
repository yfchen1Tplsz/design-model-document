package com.umbrella.cash;

public enum CashType {
    NORMAL("1"),
    RETURN("2"),
    REBATE("3");

    private String type;

    CashType(String type) {
        this.type = type;
    }

    public String type() {
        return type;
    }
}
