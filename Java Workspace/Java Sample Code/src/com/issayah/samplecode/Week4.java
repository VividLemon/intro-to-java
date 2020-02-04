package com.issayah.samplecode;
import java.util.Scanner;

public class Week4 {

	public static void main(String[] args) {
		
		// Here's a reference on various methods (behaviors) of String objects in Java
		//https://www.w3schools.com/java/java_ref_string.asp
		
		//Problem 1
		// See if you can use methods of the String class to extract/sysout the domain name from the following emailAddress
		String email1 = "bob@acme.com";
		System.out.println(email1.substring((email1.indexOf('@')+1),email1.length()));
		
		//Problem 2
		// See if you can use methods of the String class to extract/sysout the domain name from the following emailAddress
		String email2 = "bob.smith@acme.com";
		System.out.println(email2.substring((email2.indexOf('@')+1),email2.length()));
		
		
		//Problem 3
		Scanner kb = new Scanner(System.in);
		int secretNumber = 7;
		// Print this to the console: "Guess the secret number"
		// Use the Scanner object (the variable kb) to store the number (int) entered by the user 
		// If the number entered by the user is higher than secretNumber, then sysout "TOO HIGH"
		// If the number entered by the user is lower than secretNumber, then sysout "TOO LOW"
		// IF the number entered by the user is equal to secretNumber, then sysout "YOU GUESSED IT"
		
		System.out.println("Guess the secret number");
		int guessedNumber = kb.nextInt();
		
		if(guessedNumber > secretNumber) {
			System.out.println("Too high");
		}else if(guessedNumber < secretNumber) {
			System.out.println("Too low");
		}else {
			System.out.println("You guessed it");
		}
		
		
		//Problem 4
		String secretPassword = "openSesame";
		// Print this to the console: "Enter the password"
		// Use the Scanner object (the variable kb) to store the String entered by the user 
		// If the string entered by the user is equal to secretPassword, then sysout "WELCOME!"
		// If the string entered by the user is NOT equal to secretPassword, then sysout "WRONG PASSWORD"
		
		System.out.println("Enter the password" );
		String thisString = kb.next();
		
		if(thisString.equals(secretPassword)) {
			System.out.println("Welcome!");
		}else {
			System.out.println("Wrong password");
		}
		
	}

}