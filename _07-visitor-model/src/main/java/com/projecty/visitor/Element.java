package com.projecty.visitor;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public interface Element {
    void accept(Visitor visitor);
}
