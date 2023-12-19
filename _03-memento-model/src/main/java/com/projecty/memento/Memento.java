package com.projecty.memento;

public class Memento {
    private String stateInfo;

    public Memento(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
