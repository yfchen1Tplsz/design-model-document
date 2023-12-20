package com.projecty.client;

import com.projecty.bridge.*;

public class UseBridgeModelDemo {

    //桥接模式核心是抽象和实现分离，将抽象和实现分离，可以让两个维度独立变化，从而实现对两个维度的扩展。实现的根本是使用组合关系来替代继承关系，减少了子类的数量
    //桥接模式优点是：
    //1. 抽象和实现分离，扩展能力强
    //2. 实现细节对客户透明
    //3. 符合合成复用原则以及米氏替换原则
    //桥接模式的缺点是：
    //1. 桥接模式的引入会增加系统的理解与设计难度
    //2. 两个维度的理解有难度

    public static void useBridgeModel(){
        //三个附属维度 ABC
        ConcreteImplementorA concreteImplementorA = new ConcreteImplementorA();
        ConcreteImplementorB concreteImplementorB = new ConcreteImplementorB();
        ConcreteImplementorC concreteImplementorC = new ConcreteImplementorC();
        //三个主要维度 XYZ
        RefineAbstractionX refineAbstractionXA = new RefineAbstractionX(concreteImplementorA);
        RefineAbstractionX refineAbstractionXB = new RefineAbstractionX(concreteImplementorB);
        RefineAbstractionX refineAbstractionXC = new RefineAbstractionX(concreteImplementorC);
        refineAbstractionXA.operation();
        refineAbstractionXB.operation();
        refineAbstractionXC.operation();

        RefineAbstractionY refineAbstractionYA = new RefineAbstractionY(concreteImplementorA);
        RefineAbstractionY refineAbstractionYB = new RefineAbstractionY(concreteImplementorB);
        RefineAbstractionY refineAbstractionYC = new RefineAbstractionY(concreteImplementorC);
        refineAbstractionYA.operation();
        refineAbstractionYB.operation();
        refineAbstractionYC.operation();

        RefineAbstractionZ refineAbstractionZA = new RefineAbstractionZ(concreteImplementorA);
        RefineAbstractionZ refineAbstractionZB = new RefineAbstractionZ(concreteImplementorB);
        RefineAbstractionZ refineAbstractionZC = new RefineAbstractionZ(concreteImplementorC);
        refineAbstractionZA.operation();
        refineAbstractionZB.operation();
        refineAbstractionZC.operation();

    }
}
