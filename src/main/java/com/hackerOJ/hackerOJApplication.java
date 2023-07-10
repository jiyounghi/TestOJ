package com.hackerOJ;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableAsync
@EnableScheduling
@EnableCaching
@EnableConfigurationProperties
@SpringBootApplication
public class hackerOJApplication {
    public static void main(String[] args) {
        log.info("Application ready start");
        SpringApplication.run(hackerOJApplication.class, args);
        log.warn("Application compiled successfully");
    }

}
