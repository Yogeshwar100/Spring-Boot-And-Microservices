package com.ytech.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
/*
 * If the order is not defined, then Aspect will execute them one after the
 * other randomly. And if @before and @Around present then logs will be mixed
 * into one another
 */
public class VehicleStartCheckAspect {

	private Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());

	@Before("execution(* com.ytech.services.*.*(..)) && args(vehicleStarted,..)")
	public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
		// System.out.println(joinPoint.getSignature().getName());
		if (!vehicleStarted) {
			throw new RuntimeException("Vehicle not started");
		}
	}
}
