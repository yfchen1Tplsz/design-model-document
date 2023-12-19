package com.projecty.observer;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public class ConcreteObserverA implements Observer{
    @Override
    public void response() {
        System.out.println("ConcreteObserverA execute response");
    }
}
