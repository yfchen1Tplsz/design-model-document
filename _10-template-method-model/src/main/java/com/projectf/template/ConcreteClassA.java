package com.projectf.template;

public class ConcreteClassA extends AbstractTemplate{
    @Override
    public void abstractMethod1() {
        System.out.println("调用：具体实现类A 的Method1 ");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("调用：具体实现类A 的Method2 ");
    }
}
