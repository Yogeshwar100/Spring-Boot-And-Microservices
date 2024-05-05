package com.ytech.main;

import com.ytech.beans.Vehicle;
import com.ytech.config.ProjectConfig;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Vehicle volkswagen = new Vehicle();
		volkswagen.setName("Volkswagen");
		Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

		Supplier<Vehicle> audiSupplier = () -> {
			Vehicle audi = new Vehicle();
			audi.setName("Audi");
			return audi;
		};

		Random random = new Random();
		int randomNumber = random.nextInt(10);
		System.out.println("randomNumber = " + randomNumber);

		if ((randomNumber % 2) == 0) {
			context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
		} else {
			context.registerBean("audi", Vehicle.class, audiSupplier);
		}
		Vehicle volksVehicle = null;
		Vehicle audiVehicle = null;
		if (context.containsBean("Vehicle.class")) {
			Vehicle vehicle = context.getBean(Vehicle.class);
			System.out.println("Programming Vehicle name from Spring Context is: " + vehicle.getName());
		} else {
			System.out.println("No Vehicle bean present in Spring Context");
		}

	}
}
