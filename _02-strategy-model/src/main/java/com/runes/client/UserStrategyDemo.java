package com.runes.client;

import com.runes.cash.CashType;
import com.runes.context.CashContext;

public class UserStrategyDemo {
    public double getCash(CashType cashType, double money) {
        //将变化的算法和行为进行封装，就是策略模式的工作，此时Context本质上是一个策略工厂+策略调用
        return new CashContext(cashType).getCashResult(money);  //相比之下，结合了工厂模式的策略模式会暴露更少的信息给client端(少暴露CashSuper)，进一步解耦
    }
}
