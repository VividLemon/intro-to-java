package com.issayah.samplecode;

import java.util.Date;

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		System.out.println(d);
		
		Date d2 = new Date();
	
		MyDate md = new MyDate();
		md.printDate();
		
		MyDate md2 = new MyDate(2020, 1, 1);
		md2.printDate();
	}
	
	private int month;
	private int day;
	private int year;

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public MyDate() {
		Date d = new Date();
		this.month = d.getMonth() + 1;
		this.year = d.getYear() - 1900;
		this.day = d.getDate();
	}
	
	public void printDate() {
		System.out.println(this.month + "/" + this.day + "/" + this.year);
	}
	
	
}
