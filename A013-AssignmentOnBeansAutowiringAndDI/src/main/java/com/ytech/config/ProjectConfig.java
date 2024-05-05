package com.ytech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ytech.implementations", "com.ytech.services"})
@ComponentScan(basePackageClasses = {com.ytech.beans.Person.class, com.ytech.beans.Vehicle.class})
public class ProjectConfig {

}
