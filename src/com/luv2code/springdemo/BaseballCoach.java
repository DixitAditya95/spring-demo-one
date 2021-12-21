package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min";
	}

	@Override
	public String getDailyFortune() {
		
		// Use fortune Service to get Fortune.
		return fortuneService.getFortune();
	}
}
