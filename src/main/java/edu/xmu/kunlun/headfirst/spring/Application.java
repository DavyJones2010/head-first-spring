package edu.xmu.kunlun.headfirst.spring;

import edu.xmu.kunlun.headfirst.spring.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(Application.class, args);
        UserService userSvc = app.getBean(UserService.class);
        System.out.println("started " + userSvc.getUser());
    }
}
