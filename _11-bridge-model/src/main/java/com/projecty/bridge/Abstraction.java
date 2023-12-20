package com.projecty.bridge;
/**
 *
 * @author Stone
 * @date 2023/12/20
 */
// 主维度抽象类
public abstract class Abstraction {
    protected Implementor implementor;

    protected Abstraction( Implementor implementor){
        this.implementor = implementor;
    }

    public  abstract void operation();
}
