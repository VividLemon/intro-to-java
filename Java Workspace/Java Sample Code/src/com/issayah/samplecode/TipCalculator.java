package com.issayah.samplecode;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount, originalAmount, stateTax, countyTax, tip, finalAmount;
		System.out.println("Please enter an amount of the purchase: ");
		Scanner keyboard = new Scanner(System.in);
        amount = keyboard.nextInt();
        originalAmount = amount;
        
        //start taxes
        stateTax = originalAmount * 0.055;
        countyTax = originalAmount * 0.02;
        tip = originalAmount * 0.15;
        finalAmount = stateTax + countyTax + tip + originalAmount;
        System.out.println("State tax total: $" + stateTax + "\ncounty tax total: $" + countyTax + "\nTip total: $" + tip);
        System.out.println("This is your final price: \n" + "$" + finalAmount);
        
        
        
	}

}
