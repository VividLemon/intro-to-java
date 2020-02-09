package com.issayah.samplecode;

import java.util.Scanner;

public class MultipleBirths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfBabies;
		System.out.println("Enter number of babies: ");
		Scanner keyboard = new Scanner(System.in);
		numberOfBabies = keyboard.nextInt();
		
		switch(numberOfBabies)
		{
		case 1:
			System.out.println("Congratulations");
			break;
		case 2:
			System.out.println("Wow, twins!");
			break;
		case 3:
			System.out.println("Wow, tripplets");
			break;
		case 4:
		case 5:
			System.out.println("Unbelieveable: ");
			System.out.println(numberOfBabies + " babies.");
			break;
		default: 
			System.out.println("I don't believe you.");
			break;
		}
		
	}

}
