package com.example.springleki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class})
public class SpringLekiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLekiApplication.class, args);
    }

}
