package com.projecty.bridge;

public class RefineAbstractionX extends Abstraction{

    public RefineAbstractionX(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("主维度为X，执行X操作");
        super.implementor.subOperation();
    }
}
