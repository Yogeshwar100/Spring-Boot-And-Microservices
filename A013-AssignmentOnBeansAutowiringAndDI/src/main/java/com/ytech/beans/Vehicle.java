package com.ytech.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ytech.services.VehicleServices;

@Component("vehicleBean")
public class Vehicle {

	private String name;

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

}
