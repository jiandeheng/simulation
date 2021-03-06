package com.simulation.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author hedongzhou
 * @date 2018/11/17
 */
@SpringBootApplication(scanBasePackages = {"com.simulation.my"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
