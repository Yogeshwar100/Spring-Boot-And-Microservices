package com.ytech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ytech.beans.Vehicle;

@Configuration
public class ProjectConfig {

	@Bean
	Vehicle vehicle1() {
		var veh = new Vehicle();
		veh.setName("Audi");
		return veh;
	}

	@Bean
	Vehicle vehicle2() {
		var veh = new Vehicle();
		veh.setName("Honda");
		return veh;
	}

	@Bean
	Vehicle vehicle3() {
		var veh = new Vehicle();
		veh.setName("Ferrari");
		return veh;
	}

}
