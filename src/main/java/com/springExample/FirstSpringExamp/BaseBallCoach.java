package com.springExample.FirstSpringExamp;

public class BaseBallCoach implements Coach {
	private FortuneService fortuneService;
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "30 hour per day";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
