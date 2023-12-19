package com.umbrella.client;

import com.umbrella.cash.CashFactory;
import com.umbrella.cash.CashSuper;
import com.umbrella.cash.CashType;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class UserSimpleFactoryDemo {
    @Resource
    private CashFactory cashFactory;

    public double getCash(CashType type, double money) {
        CashSuper cashAdapt = cashFactory.createCashAdapt(type);
        return cashAdapt.acceptCash(money);
    }
}
