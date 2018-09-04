package com.springExample.FirstSpringExamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/springExample/FirstSpringExamp/appcontext.xml");
	    Coach coach=cont.getBean("tenise",Coach.class);
	    System.out.println(coach.getDailyWorkout());
	    System.out.println(coach.getDailyFortune());
//	    System.out.println(coach.getDailyFortune());
	}
}
