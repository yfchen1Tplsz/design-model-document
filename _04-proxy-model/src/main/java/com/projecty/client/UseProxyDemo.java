package com.projecty.client;

import com.projecty.proxy.Subject;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UseProxyDemo {
    @Resource(name = "proxy")
    private Subject subject;

    //代理模式本质上两个实现+一个组合模式，可以向client端隐藏内部的操作，也可以扩展realSubject的功能
    //demo中演示的是静态代理，也可以使用反射之类的方式来实现动态代理
    public void doRequest() {
        subject.request();
    }
}
