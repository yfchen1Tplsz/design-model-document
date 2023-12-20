package com.projectf.client;

import com.projectf.template.ConcreteClassA;
import com.projectf.template.ConcreteClassB;
/**
 *
 * @author Stone
 * @date 2023/12/20
 */
public class UseTemplateMethodDemo {

/*    模板方法模式的核心是所有的执行过程都有相对固定的步骤，
     在这个前提之下，对变化的部分进行了封装由子类继承扩展，对于不变的部分由抽象父类中公共方法复用
    模板方法模式的优点：
     1. 封装不变部分，扩展可变部分,对于新增一个实现而言符合开闭原则
    模板方式的缺点：
    1. 每个实现都需要定义一个模板方法，导致类的个数增加，系统更加庞大，不利于系统的扩展和维护
    2. 子类的执行结果可能会影响父类，是一种反向的控制，这会提高代码的阅读难度
    3. 继承关系中，如果在父类新增一个流程（抽象方法），那么以前的实现都需要实现这个抽象方法，不符合开闭原则*/
    public static void useTemplateMethod(){
        // 模板实现A 执行模板流程
        ConcreteClassA concreteClassA = new ConcreteClassA();
        concreteClassA.templateMethod();
        // 模板实现B 执行模板流程
        ConcreteClassB concreteClassB = new ConcreteClassB();
        concreteClassB.templateMethod();
    }
}
