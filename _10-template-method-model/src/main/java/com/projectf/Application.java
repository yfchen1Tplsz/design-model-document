package com.projectf;

import com.projectf.client.UseTemplateMethodDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        UseTemplateMethodDemo.useTemplateMethod();
    }

}
