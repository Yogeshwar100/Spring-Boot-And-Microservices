package com.ytech.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/* Thymeleaf is modern server side template engine like JSP(Jakarta Server pages), JSF(Jakarta Server Faces),
   Apache FreeMaker, Groovy. Thymeleaf in combination with Spring offers 'SpringViewResolver' implementation to resource reading. 
 
 * ==============================================================================================================================
 */
@SpringBootApplication
@ComponentScan("com.ytech.controller")

public class EazyschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyschoolApplication.class, args);
	}

}
