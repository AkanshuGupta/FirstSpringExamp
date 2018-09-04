package com.springExample.FirstSpringExamp;

public class HelloWorld {

	 private String messag;
	 private String messag1;
	 private String messag2;

	   public void setMessage(String message){
	      this.messag  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + messag);
	   }
	   public void setMessage1(String message1){
		      this.messag1  = message1;
		   }
		   public void getMessage1(){
		      System.out.println("Your Message : " + messag1);
		   }
		   public void setMessage2(String message2){
			      this.messag1  = message2;
			   }
			   public void getMessage2(){
			      System.out.println("Your Message : " + messag2);
			   }
	   }
