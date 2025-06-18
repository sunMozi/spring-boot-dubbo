package com.module.userconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.module")
public class UserConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserConsumerApplication.class, args);
  }
}
