package com.issayah.samplecode;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors1 {

	public static void main(String[] args) {
		
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Choose your weapon...");
		System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
		
		// Get the users choice of weapon
		int userWeapon = kb.nextInt();
		
		// Generate a random number for the computer's choice of weapon
		Random r = new Random();
		int min = 1, max = 3;
		int computerWeapon = r.nextInt(max - min + 1) + min;
		
		// TODO: Write a multi-branch IF statement to determine whether the human (user) or computer won
		// syout the winner (for example: HUMAN WINS!
		
		// converting the computers number to a string using ternary operator
		String a = "rock", b = "paper", c = "scissors", converted;
		converted = (computerWeapon == 3 ? c : (computerWeapon == 2 ? b : a));
			// User enters rock
		if(userWeapon == 1) {
			System.out.println("Computer's choice: " + computerWeapon + " (" + converted + ")");
				if(computerWeapon == 1) {
					System.out.println("Tie, try again");
				}else if(computerWeapon == 2) {
					System.out.println("Computer Wins");
				}else {
					System.out.println("User Wins");
				}		
			// User enters paper	
		}else if(userWeapon == 2) {
			System.out.println("Computer's choice: " + computerWeapon);
				if(computerWeapon == 1) {
					System.out.println("User Wins");
				}else if(computerWeapon == 2) {
					System.out.println("Tie, try again");
				}else {
					System.out.println("Computer Wins");
				}
				
		}else if(userWeapon == 3){
			System.out.println("Computer's choice: " + computerWeapon);
				if(computerWeapon == 1) {
					System.out.println("Computer Wins");
				}else if(computerWeapon == 2) {
					System.out.println("User Wins");
				}else {
					System.out.println("Tie, try again");
				}
			// User enters scissors	
		}else {
			System.out.println("You need to pick a valid weapon");
		}
	}
}