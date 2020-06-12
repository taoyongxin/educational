package com.scs.soft.educational.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tao
 */
@SpringBootApplication
@MapperScan("com.scs.soft.educational.api.mapper")
public class EducationalApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationalApiApplication.class, args);
    }

}
