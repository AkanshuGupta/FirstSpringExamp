package com.springExample.FirstSpringExamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("tenise")
public class Tenise implements Coach {

	private FortuneService fortuneService;
	@Autowired
	public Tenise(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "daily workout";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "good";
	}

}
