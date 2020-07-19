package com.park;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.park.mapper")
@SpringBootApplication
public class ParkingApplication {

    public static void main(String[] args) {
        System.out.println("----");
        SpringApplication.run(ParkingApplication.class, args);
    }

}
