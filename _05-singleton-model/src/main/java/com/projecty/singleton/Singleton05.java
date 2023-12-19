package com.projecty.singleton;

/**
 * @author Stone
 * @date 2023/12/19
 */
public enum Singleton05 {
    INSTANCE;
    //05 懒汉式单例，线程安全，效率高，使用枚举实现，甚至可以防止反射破坏单例，十分推荐使用
}
