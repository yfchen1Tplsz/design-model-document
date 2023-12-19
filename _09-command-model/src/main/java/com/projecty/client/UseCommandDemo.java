package com.projecty.client;

import com.projecty.command.ConcreteCommandA;
import com.projecty.command.ConcreteCommandB;
import com.projecty.command.Invoker;

public class UseCommandDemo {
/*
    命令模式 将请求者与实现者进行解耦。适合需要在不同时刻调用同一请求者的命令，完成操作的情形
    命令模式的优点：
    1. 请求的发起方与请求的执行方解耦，通过命令对象做调用，降低系统的耦合度
    2. 扩展性较好，增加新的命令很方便，不会影响其他的类，符合开闭原则
    命令模式的缺点：
    1. 命令模式的使用会增加系统的理解与设计难度，更适合做cqrs的系统
    4. 系统可能会需要定义很多具体命令类来实现对请求的处理，这会导致系统变得很庞大*/
    public static void useCommand(){
        //调用者 设置 命令A，并执行命令A
        Invoker invoker = new Invoker(new ConcreteCommandA());
        invoker.call();
        //调用者 改设置为命令B，执行命令B
        invoker.setCommand(new ConcreteCommandB());
        invoker.call();
    }
}
