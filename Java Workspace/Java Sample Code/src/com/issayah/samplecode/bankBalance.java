package com.issayah.samplecode;
import java.util.Scanner;
public class bankBalance{
    public static final double OVERDRAWN_PENALTY = 8.0;
    public static final double INTEREST_RATE = 0.02 ; // 2% annually

    public static void main(String[] args){
        double balance;

        System.out.println("Enter your checking accoutn balance: $");
        Scanner keyboard = new Scanner(System.in);
        balance = keyboard.nextDouble();
        System.out.println("Original balance $" + balance);

        if(balance >= 0)
            balance = balance + (INTEREST_RATE + balance) / 12;
        else
            balance = balance - OVERDRAWN_PENALTY;

        System.out.println("After adjusting for one month ");
        System.out.println("of interest and penalties");
        System.out.println("your new balance is $" + balance);
    }
}