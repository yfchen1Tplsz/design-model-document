package com.projecty.visitor;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public class ConcreteElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void operationB() {
        System.out.println("执行 operationB()");
    }
}
