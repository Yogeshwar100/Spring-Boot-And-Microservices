package com.ytech.main;

import com.ytech.config.ProjectConfig;
import com.ytech.model.Song;
import com.ytech.services.VehicleServices;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	/*
	 * NOTE: =====
	 * 
	 * An Aspect is simply a piece of code the spring framework executes when you
	 * call specific methods inside your code.
	 * 
	 * Spring AOP enables Aspect-Oriented Programming in spring applications.
	 * 
	 * AOP helps in separating and maintaining many non-business logic related
	 * code(cross cutting concerns) like logging, auditing, security, transaction
	 * management.
	 * 
	 * 
	 * AOP Jargons: ============ While defining Aspect we need to follow WWW(3 W's).
	 * WHAT -> Aspect (Piece of code we want the Spring to execute when you call a
	 * specific method) WHEN -> Advice (When the Spring need to execute the given
	 * Aspect. eg: before, after the method call) WHICH -> Pointcut (Which method
	 * inside App that framework needs to intercept and execute the given Aspect.)
	 * 
	 * Join point -> It is the event (i.e method call) that triggers the execution
	 * of an Aspect. Target object -> It is bean that declares the method/pointcut
	 * which is intercepted by an aspect.
	 * 
	 * -----------------------------------------------------------------------------
	 * --------------------------------------------- Weaving inside AOP:
	 * ===================
	 * 
	 * Without AOP, method is directly called and no interception by Spring.
	 * 
	 * But with AOP, method executions will be intercepted by proxy object and
	 * aspect will be executed. Post that actual method invocation will happen.
	 * 
	 * intercept delegate --------------> Proxy object of VehicleService bean
	 * --------------> playMusic() of actual VehicleService bean
	 * 
	 * Types of Advices in Spring AOP: ===============================
	 * 
	 * @Before --> Runs before the method of target bean.
	 * 
	 * @AfterReturning --> Runs after the method execution completes normally of
	 * target bean.
	 * 
	 * @AfterThrowing --> Runs after method execution exits by throwing an
	 * exception.
	 * 
	 * @After --> Runs after no matter how a method execution exits.
	 * 
	 * @Around --> Runs around a matched method execution (i.e both before and
	 * after).
	 * 
	 * Configuring Advices Inside AOP: ===============================
	 * 
	 * AspectJ pointcut expression: ----------------------------
	 * execution(modifier-pattern? ret-type-pattern declaring-type-pattern?
	 * name-pattern(param-pattern) throws-pattern?)
	 * 
	 * Here '?' means optional. eg: public void test(int x)throws Exception; void
	 * test(int x) --> Mandatory
	 * 
	 * eg: @Around("execution(* com.ytech.services.*.*(..))") where:
	 * com.ytech.services.* is declaring-type-pattern, here .* means after services
	 * any package is allowed. (..) means zero or any number of method parameters
	 * will allowed.
	 * 
	 * com.ytech.services.VehicleServices$$SpringCGLIB$$0 >>>>> Proxy object
	 * 
	 */
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var vehicleServices = context.getBean(VehicleServices.class);
		System.out.println(vehicleServices.getClass());
		Song song = new Song();
		song.setTitle("Blank Space");
		song.setSingerName("Taylor Swift");
		boolean vehicleStarted = true;
		String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
		String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
		String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
	}
}
