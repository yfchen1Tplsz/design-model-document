package com.umbrella.cash;

import org.springframework.stereotype.Service;

@Service
public class CashFactory {
    public CashSuper createCashAdapt(CashType type) {
        return switch (type) {
            case NORMAL -> new CashNormal();
            case RETURN -> new CashReturn(300d, 50d);
            case REBATE -> new CashRebate(0.8d);
            default -> throw new RuntimeException("Unknown cash type");
        };
    }
}
