package com.ytech.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/* @SpringBootApplication is a combination of @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan
 * @SpringBootApplication = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
 * @SpringBootConfiguration is similar to @Configuration annotation.
 * 
 * @ComponentScan annotation in Spring is used to specify the base packages to scan for Spring components such as
 * @Component, @Service, @Repository, @Controller, @RestController, etc. 
 * 
 * The exclude attribute of @SpringBootApplication allows you to exclude specific auto-configuration classes from
 * being applied. This can be useful if you want to customize the auto-configuration behavior of Spring Boot.
 * ==============================================================================================================================
 */
@SpringBootApplication
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan("com.ytech.controller")
/*
 * when beans not within Main class package or sub-package then need to declare explicitly using @ComponentScan.
 */
public class EazyschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyschoolApplication.class, args);
	}

}
