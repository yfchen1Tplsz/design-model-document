package com.projecty.singleton;

/**
 * @author Stone
 * @date 2023/12/19
 */
public class Singleton02 {
    //02 懒汉式单例实现，线程安全，但是有同步锁，效率较低

    private static Singleton02 instance;

    private Singleton02() {
    }

    public static synchronized Singleton02 getInstance() {
        if (instance == null) {
            return new Singleton02();
        }
        return instance;
    }
}
