package com.projecty.singleton;

/**
 * @author Stone
 * @date 2023/12/19
 */
public class Singleton01 {
    //01 饿汉式单例实现，线程安全，但是没有懒加载，在类加载的时候就初始化了
    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
