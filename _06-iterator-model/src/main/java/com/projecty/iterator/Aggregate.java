package com.projecty.iterator;
/**
 *
 * @author 陈宇锋
 * @date 2023/12/19
 */
public interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator getIterator();
}
