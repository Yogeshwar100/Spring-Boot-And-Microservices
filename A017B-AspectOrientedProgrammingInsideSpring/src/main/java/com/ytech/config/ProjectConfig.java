package com.ytech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.ytech.implementation", "com.ytech.services", "com.ytech.aspects" })
@EnableAspectJAutoProxy
public class ProjectConfig {

}
