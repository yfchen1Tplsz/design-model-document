package com.projecty.client;

import com.projecty.observer.ConcreteObserverA;
import com.projecty.observer.ConcreteObserverB;
import com.projecty.observer.ConcreteSubject;
import com.projecty.observer.Subject;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public class UseObserverDemo {

    // 观察者模式常用于维护一对多的依赖关系，是典型的发布-订阅模型
    //观察者模式的优点： 用抽象耦合的方式降低了观察目标和观察者们的程度，符合依赖倒置原则
    //观察者模式的缺点：并没有完全解除依赖，在观察目标中仍然调用了观察者的方法，可能出现死循环。notifyObserver -> response ->notifyObserver->...
    // 且遍历所有的观察者可能会较慢（用异步解决）
    public static void useObserver(){
        // 创建一个观察目标
        Subject concreteSubject = new ConcreteSubject();
        // 向观察目标注册两个观察者 ：A,B
        concreteSubject.add(new ConcreteObserverA());
        concreteSubject.add(new ConcreteObserverB());
        // 观察目标发生事件，通知所有观察者
        concreteSubject.notifyObservers();
    }
}
