package com.issayah.samplecode;
import java.util.Scanner;


public class StringEqualityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter two lines of text:");
		s1 = keyboard.nextLine();
		s2 = keyboard.nextLine();
		
		if(s1.equals(s2)) {
			System.out.println("The two lines are equal");
		}else {
			System.out.println("The two lines are not equal");
		}
		if(s2.equals(s1)) {
			System.out.println("The two lines are equal");
		}else {
			System.out.println("The two lines are not equal");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("but the lines are equal, ignoring case.");
		}else {
			System.out.println("The lines are not equal, even ignoring case");
		}
		
		
		
		
	}

}
