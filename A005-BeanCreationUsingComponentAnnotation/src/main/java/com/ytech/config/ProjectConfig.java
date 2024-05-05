package com.ytech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.ytech.beans")
//@ComponentScan(basePackages = {"com.ytech.beans"})
//@ComponentScan(basePackageClasses = com.ytech.beans.Vehicle.class)
//@ComponentScan(basePackageClasses = {com.ytech.beans.Vehicle.class})
@ComponentScan("com.ytech.beans")
public class ProjectConfig {

}
