package com.projecty.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 陈宇锋
 * @date 2023/12/19
 */
public class ConcreteAggregate implements Aggregate{
    private List<Object> list = new ArrayList<Object>();

    public ConcreteAggregate(List<Object> list) {
        this.list = list;
    }

    @Override
    public void add(Object object) {
        list.add(object);
    }

    @Override
    public void remove(Object object) {
        list.remove(object);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
