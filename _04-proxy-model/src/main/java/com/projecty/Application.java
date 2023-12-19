package com.projecty;

import com.projecty.client.UseProxyDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext iocContext = SpringApplication.run(Application.class, args);
        UseProxyDemo bean = iocContext.getBean(UseProxyDemo.class);
        bean.doRequest();
    }

}
