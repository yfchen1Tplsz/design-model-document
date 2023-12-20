package com.projecty.client;

import com.projecty.adapter01.Adapter;
import com.projecty.adapter01.Target;
import com.projecty.adapter02.Adaptee;

/**
 *
 * @author Stone
 * @date 2023/12/21
 */
public class UseAdaptModelDemo {

/*
    目的：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
    适配器模式的核心是将适配者和适配目标解耦，通过引入一个适配器类来重用现有的适配者代码，而无需修改原有代码。
    适配器模式优点：
    1.可以让任何两个没有关联的类一起运行，扩展性很好
    2.提高了类的复用性，通过引入一个适配器类，可以在无需修改原有代码的情况下复用现有的适配者代码,符合开闭原则
    3.将适配者和适配目标解耦，减少系统耦合度。
    适配器模式缺点：
    1.过多使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是 A 接口，其实内部被适配成了 B 接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构。
*/
    public static void useAdapterModel(){
        //类适配器模式使用：
        System.out.println("- 类适配器模式:");
        com.projecty.adapter01.Target target1 = new  com.projecty.adapter01.Adapter();
        target1.request();
        //对象适配器使用：
        System.out.println("- 对象适配器模式:");
        com.projecty.adapter02.Adaptee adaptee = new com.projecty.adapter02.Adaptee();
        com.projecty.adapter02.Target target2 = new com.projecty.adapter02.Adapter(adaptee);
        target2.request();
    }
}
