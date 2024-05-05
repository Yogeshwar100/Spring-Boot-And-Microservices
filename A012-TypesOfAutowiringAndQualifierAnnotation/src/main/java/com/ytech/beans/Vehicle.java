package com.ytech.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {

	/*
	@Autowired
	private Person person; //circular dependency
	*/
	
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println(
            "Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}
