package com.issayah.samplecode;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        
        /*
         * Looping control structures (also known as 'iteration') allows you to repeat a block of
         * code until a certain condition is met. 
         */
        
        Scanner keyboard = new Scanner(System.in);
        
        

        /*
         *  WHILE LOOP - keeps looping until a boolean expression becomes false
         *  
         *          while(boolean expression){
         *  	        // keep running this code block until the the boolean expression is false
         *      }
         *  
         *  // How does the boolean expression get change to false????
         */
                
        System.out.println("I will keep asking you for a cookie until you say 'yes'...");
        
        // STEP 1
        boolean keepLooping = true;
        while(keepLooping) {
        	System.out.println("Can I have a cookie?");
        	String input = keyboard.next();
        		if(input.equalsIgnoreCase("yes")) {
        			System.out.println("Thanks");
        			keepLooping = false;
        		}
        }
        
        /*
         * DO WHILE LOOP - The do/while loop will run the code in the block of the loop
         * before checking the condition of the loop
         * 
         *         do{
         *          // code to run
         *         }while(boolean expression);
         */
        
        // STEP 2
                    
        

        /*
         * FOR LOOPS - for loops are not controlled by a boolean expression, 
         * instead there is some sort of counter
         * 
         *         for(counter start value;  boolean expression;  counter incrementer){
         *             // this code runs for each loop (iteration)
         *         }
         * 
         *  NOTE THAT THE BOOK USES FOR LOOPS W/O CURLY BRACES!!!!!!!!
         *  ALSO NOTE THAT COUNTERS USE THE INCREMENT/DECREMENT OPERATORS
         */
        
        // STEP 3
        int counter, endIndex = 10;
        for(counter = 0; counter < endIndex; counter++) {
        	System.out.println("counter: " + counter);
        	
        }
        for(int a = 0; a < 5; a++) {
        	System.out.println(a);
        }
        
        // STEP 4
        // you can also loop down from a number
                for(counter = 10; counter > endIndex; counter--) {
                	System.out.println(counter);
                }
        
        /*
         *  Watch out for INFINITE LOOPS!
         */
        
        /*
        while(true){
            System.out.println("This is an infinite loop!");
        }
        */
        
        
        // STEP 5
        // You could use a 'counter' variable to control a WHILE loop
        int i = 0, len = 6;
        while(i < len) {
        	System.out.println(i);
        	i++;
        }
        
                
        /*
         * Watch out for this common beginner mistake:
         * 
         *     for(int counter = 0; counter < endIndex; counter++);{
         *         System.out.println("Counter: " + counter);
         *     }
         * 
         * Do you see the problem? Check out page 222
         */
                
        
        // STEP 6
        // The 'break' statement
        // You can terminate a loop before it completes all of its iterations by using the break statement
        // Ask the user to enter a number from 1 to 10
        // Then write a loop that will start at 1 an add all numbers up until input number has been reached.
        System.out.println("Enter a number between 1 and 10");
        int userInput = keyboard.nextInt();
        int total = 0;
        for(int x = 1; x <= 10; x++) {
        	total += x;
        	if(x == userInput) {
        		break;
        	}
        }
                
        
        // STEP 7
        // The 'continue' statement allows you to skip an iteration of a loop
        // Write a program that asks the user to enter a number from 1 - 10
        // Assign the number to an int variable called 'input'
        // Then write a loop that will output each number from 1-10
        // EXCEPT the number that was entered by the user
        System.out.println("Enter another number between 1 and 10");
        for(int x = 1; x <= 10; x++) {
        	if(x == userInput) {
        		continue;
        	}
        	System.out.println(x);
        }
                        
        
        // VARIABLE SCOPE - if you declare a variable inside a loop, then you won't be
        // able to use it anywhere after the loop completes (actually you wont be able to use it
        // any where except for the body of the loop.
        // In the example below, we say that the myStr variable is 'local' to the body of the loop
        
        
        for(counter = 0; counter < endIndex; counter++){
            String myStr = "hello";
            if(true) {
            	System.out.println(myStr);
            }
        }
        
        //System.out.println(myStr);
        
        
        
        
         //keyboard.close();

    }

}