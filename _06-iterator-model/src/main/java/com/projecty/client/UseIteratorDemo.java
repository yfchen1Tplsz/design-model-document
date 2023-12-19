package com.projecty.client;

import com.projecty.iterator.Aggregate;
import com.projecty.iterator.ConcreteAggregate;
import com.projecty.iterator.Iterator;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 陈宇锋
 * @date 2023/12/19
 */
@Service
public class UseIteratorDemo {

    //迭代器模式 是为了将数据的控制和遍历进行分离，并且不向外暴露数据的内部结构（职责分离+迪米特法则）
    //但是一般除了自定义的数据结构，基本上所有外部提供的数据结构都有现成的迭代器iterator，自定义数据结构对应ConcreteAggregate
    public void iterateAggregate(List<Object> data) {
        //创建自定义的聚合数据类型
        Aggregate concreteAggregate = new ConcreteAggregate(data);
        //遍历-迭代器遍历
        Iterator iterator = concreteAggregate.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
