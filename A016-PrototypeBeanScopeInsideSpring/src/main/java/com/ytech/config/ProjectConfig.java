package com.ytech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ytech.beans.Person;
import com.ytech.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = {"com.ytech.implementation",
            "com.ytech.services"})
@ComponentScan(basePackageClasses = {com.ytech.beans.Vehicle.class,
        com.ytech.beans.Person.class})
public class ProjectConfig {

}
