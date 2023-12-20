package com.projecty;

import com.projecty.client.UseAdaptModelDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        UseAdaptModelDemo.useAdapterModel();
    }

}
