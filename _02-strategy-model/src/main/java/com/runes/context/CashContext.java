package com.runes.context;

import com.runes.cash.*;

public class CashContext {
    private CashSuper cashSuper; //组合策略

    public CashContext(CashType cashType) {
        this.cashSuper = switch (cashType) {
            case NORMAL -> new CashNormal();
            case RETURN -> new CashReturn(300d, 50d);
            case REBATE -> new CashRebate(0.8d);
            default -> throw new RuntimeException("Unknown cash type");
        };
    }

    public double getCashResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
