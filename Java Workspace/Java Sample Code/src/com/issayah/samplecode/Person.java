package com.issayah.samplecode;

public class Person {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = Math.max(3,5);
		System.out.println(x);
		float y = Math.max(1.5f, 2.5f);
	}

	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void changeName(String firstname) {
		this.firstName = firstName;
	}
	
	public void changeName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	
}
