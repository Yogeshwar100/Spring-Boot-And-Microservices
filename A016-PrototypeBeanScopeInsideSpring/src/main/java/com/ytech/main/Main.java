package com.ytech.main;

import com.ytech.beans.Person;
import com.ytech.config.ProjectConfig;
import com.ytech.services.VehicleServices;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
/*
 NOTE:
 If class name is MyVehicleEngine then bean name will become myVehicleEngine in spring context.
 Eager and lazy loading terms not applicable for Prototype scoped beans since they created every time when reference created.
 */
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean("vehicleServices",VehicleServices.class);
        System.out.println("Hashcode of the object vehicleServices1 : " +vehicleServices1.hashCode());
        System.out.println("Hashcode of the object vehicleServices2 : " +vehicleServices2.hashCode());
        if(vehicleServices1==vehicleServices2){
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }else{
            System.out.println("VehicleServices bean is a prototype scoped bean");
        }
       
    }
}
