package com.projecty.client;

import com.projecty.visitor.*;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
public class UseVisitorDemo {

/*    访问者模式是将访问的动作进行了抽离，该模式适合处理手段多样但是访问的对象相对固定的情况
     访问者模式优点：
     1、访问者模式将数据和行为进行了分离，使得数据和行为可以独立变化。
     2、访问者模式使得增加新的访问行为变得很容易，无须修改原有的代码，符合“开闭原则”。
     3、访问者模式可以让数据和行为在不同的环境中进行切换，符合“多态性”,代码复用性好。
    访问者模式缺点：
     1、增加新的访问对象时，必须为所有访问者新增该访问对象的实现，违背开闭原则”。
     2、破坏了依赖倒置原则，访问者依赖于具体的访问对象。
     3、破坏封装性，访问对象对访问者时公开了具体的细节。*/
    //总结来说就是，行为多样但是行为的对象相对固定的情况，适合使用访问者模式。
    public static void useVisitor(){
        ObjectStructure objectStructure = new ObjectStructure();
        Element elementA = new ConcreteElementA();
        Element elementB = new ConcreteElementB();
        objectStructure.add(elementA);
        objectStructure.add(elementB);
        // 用访问者A去访问结构体
        Visitor visitorA = new ConcreteVisitorA();
        objectStructure.accept(visitorA);
        // 用访问者B去访问结构体
        Visitor visitorB = new ConcreteVisitorB();
        objectStructure.accept(visitorB);
    }
}
