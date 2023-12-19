package com.projecty.observer;

import java.util.Iterator;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObservers() {
        // 事件发生，通知所有注册的观察者
        System.out.println("事件发生，通知所有注册的观察者");
        Iterator<Observer> iterator = super.observers.iterator();
        while (iterator.hasNext()) {
            iterator.next().response();
        }
    }
}
