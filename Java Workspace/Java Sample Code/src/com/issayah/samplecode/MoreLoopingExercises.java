package com.issayah.samplecode;
import java.util.Scanner;
public class MoreLoopingExercises {

	public static void main(String[] args) {
		
		
		// Problem 1
		// Write a loop that counts down from 10 to 1.
		// Inside the body of the loop, sysout the counter variable
		// The output should be: 10,9,8,7,6,5,4,3,2,1
			for(int x = 10; x > 0; x--) {
				System.out.println(x);
			}
		System.out.println("end 1");
		// Problem 2
		// Write a loop that starts at 0 an ends at 10
		// Sysout the even numbers between, and including, 0 and 10
		for(int y = 0; y <= 10; y++) {
			System.out.println(y);
		}
		System.out.println("end 2");
	
		// Problem 3
		// Write a loop that prints out all numbers between 1 and 20 that are evenly divisible by 3
		for(int z = 1; z <= 20; z++) {
			if(z % 3 == 0) {
				System.out.println(z);
			}
		}
		System.out.println("end 3");
		// Problem 4
		// Write a loop that iterates through each letter in the String below
		// It should sysout each letter in the string on it's own line like this:
		//
		// H
		// e
		// l
		// l
		// o
		//
		// You should make use of the length() method and the charAt() methods of the String class to solve this problem
		String str = "Hello";
		for(int a = 0; a < str.length(); a++) {
			System.out.println(str.charAt(a));
		}
		System.out.println("end 4");
		
		// Problem 4
		// Use your imagination to come up with a code sample that makes use of a switch/case statement.
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number 1-3");
		int b = kb.nextInt();
		switch(b) {
		case 1:
			System.out.println("Value is 1");
			break;
		case 2: 
			System.out.println("Value is 2");
			break;
		case 3:
			System.out.println("Value is 3");
			break;
		default: 
			System.out.println("The number you chose is not in the range.");
			break;
		}
		
	}
}