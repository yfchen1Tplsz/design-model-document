package com.projecty.proxy;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component("proxy")
public class Proxy implements Subject {
    @Resource
    private RealSubject realSubject;

    @Override
    public void request() {
        this.preRequest();
        realSubject.request();
        this.postRequest();
    }

    private void preRequest() {
        System.out.println("代理前置操作");
    }

    private void postRequest() {
        System.out.println("代理后置操作");
    }
}
