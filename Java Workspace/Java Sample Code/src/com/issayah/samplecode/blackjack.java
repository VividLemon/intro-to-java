package com.issayah.samplecode;

import java.util.Scanner;
import java.util.Random;

public class blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean start = true;
		int startingM = 100;
		System.out.println("Test build! Break me!");
		while(start) {
			boolean hit = true;
			//simple, rank and suit are non existent
			//declaring variables
			
			Scanner keyboard = new Scanner(System.in);
			// cash amount
			System.out.println("Place your bet. \n You have: " + startingM);
			int betted = keyboard.nextInt();
			if(betted > startingM) {
				System.out.println("You can't bet more than you have! \n Enter a correct value:");
				betted = keyboard.nextInt();
			}else {
				startingM -= betted;
				System.out.println("New balance: " + startingM);
			}
			System.out.println("Bets placed, now starting. Dealer will always stay on 16+");
			// start dealing user
				Random r = new Random();
			
				int min = 2, max = 11;
				int computerWeapon = r.nextInt(max - min + 1) + min;
				int pulled = r.nextInt(max - min + 1) + min;
				System.out.println("First card: " + pulled);
				pulled += r.nextInt(max - min + 1) + min;
				System.out.println("Combined value: " + pulled);
				
				boolean compBust = false, userBust = false;
				
				while(hit) {
					if(pulled == 21) {
						hit = false;
						System.out.println("Blackjack, nice");
					}else if(pulled > 21) {
						userBust = true;
						hit = false;
					}else {
						System.out.println("Would you like to hit? y/n");
						String answer = keyboard.next();
						if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
							pulled += r.nextInt(max - min + 1) + min;
							System.out.println(pulled);
						}else {
							hit = false;
						}
					}//first else
				}//while
				//start computer
				boolean compHit = true;
				int compPull = r.nextInt(max - min + 1) + 1;
				compPull += r.nextInt(max - min + 1) + 1;
				while(compHit)
				if(compPull < 16) {
					compPull += r.nextInt(max - min + 1) + 1;
					compHit = true;
				}else if(compPull >= 16 && compPull <= 21) {
					compHit = false;
				}else {
					compBust = true;
					compHit = false;
				}
				System.out.println("Dealers total: " + compPull);
				//eval winner
				
				if(userBust == true) {
					System.out.println("User busts!");
				}else if(compBust == true) {
					System.out.println("Dealer busts!");
					if(pulled == 21) {
						System.out.println("User wins with blackjack");
						startingM += betted * 2.5;
					}else {
						startingM += betted * 2;
					}
				}else if(compPull > pulled) {
					System.out.println("Dealer wins!");
				}else if(compPull < pulled && pulled == 21){
					System.out.println("User wins with blackjack");
					startingM += betted * 2.5;
				}else if(compPull < pulled) {
					System.out.println("User wins");
					startingM += betted * 2;
				}else {
					System.out.println("Tie, nobody wins \n" + "You pulled " + pulled + " : "+ "Computer pulled " + compPull );
				}
				
				System.out.println("Current total: " + startingM);
				
				
				System.out.println("Would you like to play again? y/n");
				String again = keyboard.next();
				if(again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y")) {
					start = true;
				}else {
					start = false;
					System.out.println("Final take: " + startingM);
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
		}
	}

}
