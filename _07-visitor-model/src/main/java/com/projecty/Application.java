package com.projecty;

import com.projecty.client.UseVisitorDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * @author Stone
 * @date 2023/12/19
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        UseVisitorDemo.useVisitor();
    }

}
