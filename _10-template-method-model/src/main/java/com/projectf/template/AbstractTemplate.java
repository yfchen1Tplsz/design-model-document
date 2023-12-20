package com.projectf.template;

public abstract class AbstractTemplate {
    public void templateMethod(){
        // 形成一套模板，可以是公共的方法也可以是具体的实现类方法，
        // 总之形成一套相对固定的调用流程，所有实现子类都是走这个模板方法
        specificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void specificMethod(){
        System.out.println("调用模板方法的公共方法1");
    }
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
}
