package com.projecty.memento;

public class Originator {
    private String stateInfo;

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public String getStateInfo() {
        return this.stateInfo;
    }

    public Memento createMemento() {
        return new Memento(this.stateInfo);
    }

    public void restoreMemento(Memento memento) {
        this.stateInfo = memento.getStateInfo();
    }

}
