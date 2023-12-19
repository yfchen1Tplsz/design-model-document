package com.projecty.command;

public class ConcreteCommandB implements Command{

    private ReceiverB receiverB ;

    public ConcreteCommandB() {
        receiverB = new ReceiverB();
    }

    @Override
    public void execute() {
        receiverB.action();
    }
}
