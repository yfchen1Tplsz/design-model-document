package com.projecty;

import com.projecty.client.UseIteratorDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        UseIteratorDemo bean = context.getBean(UseIteratorDemo.class);
        bean.iterateAggregate(Arrays.asList(new String[]{"a", "b", "c"}));
    }

}
