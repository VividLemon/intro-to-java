package com.issayah.samplecode;

import java.util.Calendar;
import java.util.Date;

public class Params {

	
	public static void main(String[] args) {
		
		int number = 2;
		Params.updatePrimitive(number);
		System.out.println(number);
		
		Date today = new Date();
		Params.updateDateObject(today);
		System.out.println(today.toLocaleString());
		
		String str = "FOO";
		Params.updateStringObject(str);
		System.out.println(str);

	}
	
	
	public static void updatePrimitive(int someInt) {
		someInt *= 2;
	}
	
	
	public static void updateDateObject(Date someDate) {
		someDate.setYear(0);
		
	}
	
	
	public static void updateStringObject(String someString) {
		someString = "BAR";
	}

}