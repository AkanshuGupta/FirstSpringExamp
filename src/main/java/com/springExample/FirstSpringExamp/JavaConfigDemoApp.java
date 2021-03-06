package com.springExample.FirstSpringExamp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
     public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new 
			AnnotationConfigApplicationContext(SportConfig.class);
	Coach theCoach = context.getBean("tennisCoach", Coach.class);

	Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
	
	
	boolean result = (theCoach == alphaCoach);
	
	System.out.println("\nPointing to the same object: " + result);
	
	System.out.println("\nMemory location for theCoach: " + theCoach);

	System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

     }
	
}
