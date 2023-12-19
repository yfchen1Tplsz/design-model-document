package com.projecty.visitor;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(ConcreteElementA elementA) {
        //访问者B 访问 元素A
        System.out.println("ConcreteVisitorA 访问 ConcreteElementA");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        //访问者B 访问 元素B
        System.out.println("ConcreteVisitorA 访问 ConcreteElementB");
        elementB.operationB();
    }
}
