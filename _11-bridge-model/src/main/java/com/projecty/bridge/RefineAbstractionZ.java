package com.projecty.bridge;

public class RefineAbstractionZ extends Abstraction{

    public RefineAbstractionZ(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("主维度为Z，执行Z操作");
        super.implementor.subOperation();
    }
}
