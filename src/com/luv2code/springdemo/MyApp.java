package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		// load Spring COnfiguration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("MyTrackCoach", Coach.class);
		
		// Call Method in the beans
		System.out.println(theCoach.getDailyWorkout());
		
		// Call injected dependency method
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
