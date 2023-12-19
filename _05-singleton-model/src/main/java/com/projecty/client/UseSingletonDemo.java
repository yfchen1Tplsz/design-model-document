package com.projecty.client;

import com.projecty.singleton.*;
import org.springframework.stereotype.Service;

@Service
public class UseSingletonDemo {
    public static void useSingleton() {
        Singleton01 instance01 = Singleton01.getInstance();
        Singleton02 instance02 = Singleton02.getInstance();
        Singleton03 instance03 = Singleton03.getInstance();
        Singleton04 instance04 = Singleton04.getInstance();
        Singleton05 instance05 = Singleton05.INSTANCE;

        System.out.println("instant :" + instance01);
        System.out.println("instant :" + instance02);
        System.out.println("instant :" + instance03);
        System.out.println("instant :" + instance04);
        System.out.println("instant :" + instance05.toString());
    }
}
