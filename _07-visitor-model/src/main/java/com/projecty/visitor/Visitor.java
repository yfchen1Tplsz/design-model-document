package com.projecty.visitor;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}
