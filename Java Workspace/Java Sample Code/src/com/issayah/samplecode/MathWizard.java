package com.issayah.samplecode;
public class MathWizard {
	
	/*
	 * TOPICS THAT WE CAN DISCUSS WHILE DOING THIS ACTIVITY
	 * NOTICE THE INDENTATION!!!!!
	 * Classes
	 * Class Members
	 * 	instance variables
	 *  methods
	 * Instantiation
	 * Dot Operator
	 * Methods
	 *  invoking
	 *  void methods
	 *  this
	 *  
	 *  Note how number of calculations can become corrupted (we need some ENCAPSULATION)
	 */
	
	// create an instance variable - each instance of the MathWizard will keep track of how many calculations have been performed
	int numberOfCalculationsPerformed;
	
	// create a method named 'add' that takes two ints (parameters) and returns the total
	public int add(int num1, int num2) {
		this.numberOfCalculationsPerformed++; 
		int sum = num1 + num2;
		return sum;
	}
	
	// create a method named 'divide' that takes two ints (parameters), divides the first one by the second one and
	// returns a float
	public float divide(int num1, int num2) {
		this.numberOfCalculationsPerformed++;
		return (float)num1/num2;
		
	}
	
	// create a method named 'showNumberOfCalculations' that prints the numberOfCalculationsPerformed 
	// it should have NO parameters and return void
	public void showNumberOfCalculations() {
		System.out.println("I have performed " + this.numberOfCalculationsPerformed + " calculations");
	}
	

}