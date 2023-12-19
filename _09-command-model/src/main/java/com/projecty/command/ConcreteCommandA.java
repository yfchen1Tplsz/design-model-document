package com.projecty.command;

public class ConcreteCommandA implements Command{

    private ReceiverA receiverA ;

    public ConcreteCommandA() {
        receiverA = new ReceiverA();
    }

    @Override
    public void execute() {
        receiverA.action();
    }
}
