package com.ytech.eazyschool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
/*
 * Using permitAll() configuration we can allow full/public access to a specific resource/path or all the resource/paths inside a web application.
 * eg: public API's, paths, css, Images, JS files etc.
 * 
 * Using denyAll() configurations we can deny access to a specific resource/path or all the resources/paths inside a web application regardless of user
 * authentication. Usually, denyAll() is used to retire a specific API temporarily without removing code for testing purpose.
 */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        // Permit All Requests inside the Web Application
        http.authorizeHttpRequests(requests -> requests.anyRequest().permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        // Deny All Requests inside the Web Application
            /*http.authorizeHttpRequests(requests -> requests.anyRequest().denyAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());*/

        return http.build();

    }

}
