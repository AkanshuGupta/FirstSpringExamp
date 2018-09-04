package com.springExample.FirstSpringExamp;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class multiClass {
	public static void main(String[] args) {
		Test test=new Test();
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String str=sdf.format(cal.getTime());
		test.setOne(str);
		System.out.println(test.getOne());
		System.out.println(test.getOne());
		System.out.println(test.getOne());
		System.out.println(test.getOne());
		System.out.println(test.getOne());
	}	
}
class Test{
	String one;

	/**
	 * @return the one
	 */
	public String getOne() {
		return one;
	}

	/**
	 * @param one the one to set
	 */
	public void setOne(String one) {
		this.one = one;
	}
}
