package com.ytech.main;

import com.ytech.beans.Vehicle;
import com.ytech.config.ProjectConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		// Vehicle veh = context.getBean(Vehicle.class);
		Vehicle veh = context.getBean("vehicle1", Vehicle.class);
		System.out.println("Vehicle name from Spring Context is: " + veh.getName());
	}
}
