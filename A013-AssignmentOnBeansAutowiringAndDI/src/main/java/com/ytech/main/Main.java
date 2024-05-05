package com.ytech.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ytech.beans.Person;
import com.ytech.beans.Vehicle;
import com.ytech.config.ProjectConfig;
import com.ytech.interfaces.Speakers;
import com.ytech.interfaces.Tyres;
import com.ytech.services.VehicleServices;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		String[] tyres=context.getBeanNamesForType(Tyres.class);
		String[] speakers=context.getBeanNamesForType(Speakers.class);

		System.out.println("Bean of Tyres type: ");
		for(String tyre: tyres) {
			System.out.println(tyre);
		}
		System.out.println("Bean of Speakers type: ");
		for(String speaker: speakers) {
			System.out.println(speaker);
		}
		
		VehicleServices vehicleServices=context.getBean(VehicleServices.class);
		vehicleServices.moveVehicle();
		vehicleServices.playMusic();
		System.out.println("===========================================");
		Person person=context.getBean(Person.class);
		Vehicle vehicle=context.getBean(Vehicle.class);
		
		person.getVehicle().getVehicleServices().playMusic();
		vehicle.getVehicleServices().moveVehicle();
				

	}

}
