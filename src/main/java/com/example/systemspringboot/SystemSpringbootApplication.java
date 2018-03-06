package com.example.systemspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pc
 */
@Configuration
//开启扫描指定位置的注解
@ComponentScan(basePackages = "com.example.systemspringboot")
//使用此注解可以注册 Mybatis mapper 接口类
@MapperScan(basePackages = "com.example.systemspringboot.dao")
@SpringBootApplication
public class SystemSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemSpringbootApplication.class, args);
	}
}
