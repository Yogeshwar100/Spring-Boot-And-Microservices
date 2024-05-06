package com.ytech.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ytech.services.VehicleServices;

/*
NOTE:
	The Vehicle bean is a singleton-scoped bean, and inside it, we inject the VehicleServices bean, which is a prototype-scoped
	bean. Therefore, VehicleServices will behave as a singleton bean since the parent bean is of singleton scope. If the parent 
	is also a prototype-scoped bean, then injection will behave as a prototype-scoped bean.
*/

@Component("vehicleBean")
public class Vehicle {

	private String name = "Honda";
	private final VehicleServices vehicleServices;

	@Autowired
	public Vehicle(VehicleServices vehicleServices) {
		this.vehicleServices = vehicleServices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehicleServices getVehicleServices() {
		return vehicleServices;
	}

	public void printHello() {
		System.out.println("Printing Hello from Component Vehicle Bean");
	}

	@Override
	public String toString() {
		return "Vehicle name is - " + name;
	}
}
