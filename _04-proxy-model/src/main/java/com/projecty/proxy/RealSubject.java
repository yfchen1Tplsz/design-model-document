package com.projecty.proxy;

import org.springframework.stereotype.Component;

@Component("realSubject")
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("执行real request操作");
    }
}
