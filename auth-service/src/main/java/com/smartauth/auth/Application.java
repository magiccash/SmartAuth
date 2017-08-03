package com.smartauth.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by wuban on 2017/8/3.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext cac = SpringApplication.run(Application.class, args);
        cac.registerShutdownHook();
    }
}
