package com.issayah.samplecode;
import java.util.Scanner;

public class LoopingExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String secretPassword = "opensesame";
		Scanner kb = new Scanner(System.in);
		String userInput = "";
		while(!(secretPassword.equals(userInput))) {
			System.out.println("Enter the password");
			userInput = kb.next();
			if(!(userInput.equals(secretPassword))) {
				System.out.println("That is incorrect.");
			}
		}
		System.out.println("You entered the secret password!");
		do {
			System.out.println("Enter the password again");
			userInput = kb.next();
			if(!(userInput.equals(secretPassword))) {
				System.out.println("That is incorrect.");
			}
		} while(!(secretPassword.contentEquals(userInput)));
		for(int x = 1; x <= 5; x++) {
			System.out.println(x);
		}
		System.out.println("Enter a number between 1 and 10");
		int userNum = kb.nextInt();
		for(int y = 0; y <= 10; y++) {
			if(userNum == y) {
				break;
			}else {
				System.out.println(y);
			}
		}
		for(int z = 6; z >= 1; z--) {
			System.out.println(z);
		}
		for(int a = 0; a <= 10; a += 2) {
			System.out.println(a);
		}
//		for(int b = 1; b <= 100; b++) {
//			if(((b / 3) % 2) == 1 || ((b / 5) % 2) == 1) {
//				
//			}else {
//				System.out.println(b);
//			}
//		}
		
		
		
	}

}
