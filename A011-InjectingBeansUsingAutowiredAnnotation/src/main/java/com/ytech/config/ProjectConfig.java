package com.ytech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ytech.beans.Person;
import com.ytech.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = "com.ytech.beans")
public class ProjectConfig {

}
