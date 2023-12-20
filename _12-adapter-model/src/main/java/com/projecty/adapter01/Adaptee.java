package com.projecty.adapter01;
/**
 *
 * @author Stone
 * @date 2023/12/20
 */
//适配者（等待适配对象）
public class Adaptee {
    public void specificRequest(){
        System.out.println("适配者方法被调用");
    }
}
