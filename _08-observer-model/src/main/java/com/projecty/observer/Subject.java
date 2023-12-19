package com.projecty.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }
    public abstract void notifyObservers();
}
