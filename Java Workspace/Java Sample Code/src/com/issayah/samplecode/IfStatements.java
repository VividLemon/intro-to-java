package com.issayah.samplecode;
	import java.util.Scanner;
public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// IF statement are control structure
			/* 
			 * if(boolean expression goes here){
			 * code to run if boolean expression is true
			 * }
			 */
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter a number");
			int number = keyboard.nextInt();
			
			if(number > 10) {
			System.out.println("ITS OBVIOUSLY GREATER THAN !)");	
			}else {System.out.println("idiot");}
			
			
			
			
	}

}
