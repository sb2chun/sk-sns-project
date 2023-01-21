package com.fastcampus.snsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@ComponentScan(basePackages = {"com.fastcampus.snsproject.repository"})
//@EnableJpaRepositories("com.fastcampus.snsproject.repository")
public class FastcampusSnsProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastcampusSnsProjectApplication.class, args);
    }

}
