package com.hust.maven.mavenstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 注意,这里要加scanBasePackages, 不然controller那边不生效.
@SpringBootApplication(scanBasePackages = "com.hust.maven")
public class MavenStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenStarterApplication.class, args);
    }
}
