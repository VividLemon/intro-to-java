package com.issayah.samplecode;

import java.util.Scanner;

public class week8Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the answer, it's between 1 & 3");
		int answer = 3;
		int guess = keyboard.nextInt();
		while(answer != guess) {
			System.out.println("Try again");
			guess = keyboard.nextInt();
		}
		System.out.println("Good job");
		
		for(int x = 0; x <= 100; x++) {
			System.out.println(x);
		}
		
		System.out.println("Enter your meal choice, beef, chicken, or fish");
		String choice = keyboard.next();
		if(choice.equalsIgnoreCase("beef")) {
			System.out.println("I suggest a side of a baked potato");
		}else if(choice.equalsIgnoreCase("chicken")) {
			System.out.println("I suggest a side of pasta");
		}else if(choice.equalsIgnoreCase("fish")) {
			System.out.println("I suggest a side of veggies");
		}else {
			System.out.println("I suggest you pick one of the given answers, or you will get no food at all.");
		}
		
		
		
	}

}
