package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	
	private String team;
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor.");
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method.");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practive fast bowling 15 min daily..";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
