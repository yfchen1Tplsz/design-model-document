package com.projecty.singleton;

/**
 * @author Stone
 * @date 2023/12/19
 */
public class Singleton04 {
    //04 懒汉式单例，线程安全，使用静态内部类的常量属性实现，效率高
    private static class InstanceHolder {
        private static final Singleton04 INSTANCE = new Singleton04();
    }

    public static Singleton04 getInstance() {
        return InstanceHolder.INSTANCE;
    }

}
