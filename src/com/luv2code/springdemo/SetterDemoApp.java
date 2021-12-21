package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load Spring COnfiguration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// Retrieve Bean from Spring Container
		CricketCoach theCoach = context.getBean("MyCricketCoach", CricketCoach.class);
				
		// Call Method in the beans
		System.out.println(theCoach.getDailyWorkout());
				
		// Call injected dependency method
		System.out.println(theCoach.getDailyFortune());
		
		// Call injected dependency method
		System.out.println(theCoach.getEmailAddress());
				
		// Call injected dependency method
		System.out.println(theCoach.getTeam());
				
		// close the context
		context.close();				
	}

}
