package com.issayah.samplecode;

import java.util.Random;
import java.util.Scanner;

public class MoreLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 1; x <= 5; x++) {
			System.out.println(x);
			if(x % 2 == 0) {
				System.out.println(x + " is even");
			}
		}
		Random rand = new Random();
		int randomNumber = rand.nextInt(10) + 1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guess the random number between 1 & 10");
		boolean correct = true;
		
		while(correct) {
			int guess = keyboard.nextInt();
			if(guess == randomNumber) {
				correct = false;
			} else {
				System.out.println("Wrong");
			}
		}
		System.out.println("You guessed it");

		char letter = 65;
		int numberOfLetters = 26;
		
		for(int x = 0; x < numberOfLetters; x++) {
			System.out.println(letter);
			letter++;
			for(int y = 1; y < 3; y++) {
				System.out.println("-" + y);
			}
		}
		
		String[] arrayOfStrings = {"Bob", "Sally", "Betty",};
		for (String s : arrayOfStrings) {
			System.out.println(s);
		}
		
	}
}
