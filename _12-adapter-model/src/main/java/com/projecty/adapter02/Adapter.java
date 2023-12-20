package com.projecty.adapter02;

import com.projecty.adapter02.Target;

//对象适配器模式，使用组合方式实现，耦合更低
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
