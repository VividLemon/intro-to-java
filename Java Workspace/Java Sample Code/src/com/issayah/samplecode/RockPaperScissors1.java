package com.issayah.samplecode;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors1 {

	public static void main(String[] args) {
		System.out.println("The game will end when the first person hits 5 wins");
		boolean start = true;
		int numOfWinsUser = 0;
		int numOfWinsComp = 0;
		// true start
		while(start) {

			Scanner kb = new Scanner(System.in);
			System.out.println("\nChoose your weapon...");
			System.out.println("1 = Rock, 2 = Paper, 3 = Scissors");
			
			// Get the users choice of weapon
			int userWeapon = kb.nextInt();
			
			// Generate a random number for the computer's choice of weapon
			Random r = new Random();
			int min = 1, max = 3;
			int computerWeapon = r.nextInt(max - min + 1) + min;
			
			// TODO: Write a multi-branch IF statement to determine whether the human (user) or computer won
			// syout the winner (for example: HUMAN WINS!
			
			// converting the input number to string, then outputting who chose what.
			String convertedComp, convertedUser;
			convertedComp = (computerWeapon == 3 ? "scissors" : (computerWeapon == 2 ? "paper" : "rock"));
			convertedUser = (userWeapon == 3 ? "scissors" : (userWeapon == 2 ? "paper" : (userWeapon == 1 ? "rock" : "INVALID!")));
			System.out.println("You have chosen: " + userWeapon + " (" + convertedUser + "). " + "While the computer chose: " + computerWeapon + " (" + convertedComp + ")");
			
			// User enters rock
			if(userWeapon == 1) {
					if(computerWeapon == 1) {
						System.out.println("Tie, try again");
					}else if(computerWeapon == 2) {
						System.out.println("Computer Wins This Round");
						numOfWinsComp++;
					}else {
						System.out.println("User Wins This Round");
						numOfWinsUser++;
					}		
				// User enters paper	
			}else if(userWeapon == 2) {
					if(computerWeapon == 1) {
						System.out.println("User Wins This Round");
						numOfWinsUser++;
					}else if(computerWeapon == 2) {
						System.out.println("Tie, try again");
					}else {
						System.out.println("Computer Wins This Round");
						numOfWinsComp++;
					}
					
			}else if(userWeapon == 3){
					if(computerWeapon == 1) {
						System.out.println("Computer Wins This Round");
						numOfWinsComp++;
					}else if(computerWeapon == 2) {
						System.out.println("User Wins This Round");
						numOfWinsUser++;
					}else {
						System.out.println("Tie, try again");
					}
				// User enters scissors	
			}else {
				System.out.println("You need to pick a valid weapon");	
			}
			
			//grammar conversion for wins
			String gramUser, gramComp;
			gramComp = (numOfWinsComp == 1 ? "once" : (numOfWinsComp == 2 ? "twice" : "times"));
			gramUser = (numOfWinsUser == 1 ? "once" : (numOfWinsUser == 2 ? "twice" : "times"));
				
			System.out.println("You have won: " + numOfWinsUser + " " + gramUser + ",\nwhile the computer has won: " + numOfWinsComp + " " + gramComp + ",");
			
			if(numOfWinsComp == 5) {
				System.out.println("Computer wins the game!");
				start = false;
			} else if(numOfWinsUser == 5) {
				System.out.println("\nYou have won the game!");
				start = false;
				
				
			kb.close();
			}
		}
	}
}