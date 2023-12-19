package com.projecty.visitor;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public class ConcreteElementA implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public void operationA() {
        System.out.println("执行 operationA()");
    }
}
