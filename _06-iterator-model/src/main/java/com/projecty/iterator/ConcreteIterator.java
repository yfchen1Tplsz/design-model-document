package com.projecty.iterator;

import java.util.List;

/**
 *
 * @author 陈宇锋
 * @date 2023/12/19
 */
public class ConcreteIterator implements Iterator{
    private final List<Object> list;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object object = null;
        if(this.hasNext()){
            object = list.get(++index);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if(index < list.size() -1){
            return true;
        }
        return false;
    }
}
