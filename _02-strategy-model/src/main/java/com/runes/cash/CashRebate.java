package com.runes.cash;

public class CashRebate implements CashSuper {

    private double rebateRate = 1.0d;

    public CashRebate(double rebateRate) {
        this.rebateRate = rebateRate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebateRate;
    }
}
