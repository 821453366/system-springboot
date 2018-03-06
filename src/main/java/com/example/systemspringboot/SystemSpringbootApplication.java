package com.example.systemspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pc
 */
@Configuration
//开启通用注解扫描
@ComponentScan(basePackages = "com.example.systemspringboot")
@SpringBootApplication
public class SystemSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemSpringbootApplication.class, args);
	}
}
