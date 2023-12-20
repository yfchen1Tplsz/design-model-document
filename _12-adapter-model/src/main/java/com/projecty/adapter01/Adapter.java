package com.projecty.adapter01;

//类适配器模式，用继承来实现
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //在此适配，无需修改待适配对象和适配目标的代码，符合开闭原则
        super.specificRequest();
    }
}
