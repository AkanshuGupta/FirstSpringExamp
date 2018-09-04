package com.springExample.FirstSpringExamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class cll{
	String time;
	  /**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	}
	public class MainApp {
		
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("com/springExample/FirstSpringExamp/applicationContext.xml");
//	      HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
//	      obj.setMessage("Hello");
//	      obj.getMessage();
	      HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
	      obj.getMessage();
	      HelloWorld obhB=(HelloWorld) context.getBean("hhelloWorld");
//	      obhB.setMessage("world!");
	      obhB.getMessage1();
	      cll cl=new cll();
	      cl.setTime("hjgdshjs");
	      System.out.println(cl.getTime());
	      Coach theCoach=context.getBean("coach",Coach.class);
	      System.out.println(theCoach.getDailyWorkout());
	      System.out.println(theCoach.getDailyFortune());
	        
	   }
}
