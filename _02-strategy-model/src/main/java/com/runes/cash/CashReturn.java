package com.runes.cash;

public class CashReturn implements CashSuper {

    private final double moneyLimit;
    private final double moneyReturn;

    public CashReturn(double moneyLimit, double moneyReturn) {
        if (moneyLimit <= 0) {
            throw new IllegalArgumentException();
        }
        this.moneyLimit = moneyLimit;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (result >= moneyLimit) {
            result = money - Math.floor(money / moneyLimit) * moneyReturn;
        }
        return result;
    }
}
