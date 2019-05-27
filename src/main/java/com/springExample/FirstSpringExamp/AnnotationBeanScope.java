package com.springExample.FirstSpringExamp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScope {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("com/springExample/FirstSpringExamp/appcontext.xml");	
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tenise", Coach.class);

		Coach alphaCoach = context.getBean("tenise", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close the context
		context.close();
		//comment added
	}

}








