package com.projecty.singleton;

/**
 * @author Stone
 * @date 2023/12/19
 */
public class Singleton03 {
    //03 懒汉式单例模式，线程安全，使用双重检查（Double-Checked Locking），解决效率低问题
    private static Singleton03 instance;

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        if (instance == null) {
            synchronized (Singleton03.class) {
                if (instance == null) {
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }
}
