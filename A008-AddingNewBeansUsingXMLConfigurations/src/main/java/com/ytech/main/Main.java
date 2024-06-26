package com.ytech.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ytech.beans.Vehicle;

public class Main {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

    }
}
