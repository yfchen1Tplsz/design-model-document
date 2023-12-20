package com.projecty.bridge;

public class RefineAbstractionY extends Abstraction{

    public RefineAbstractionY(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("主维度为Y，执行Y操作");
        super.implementor.subOperation();
    }
}
