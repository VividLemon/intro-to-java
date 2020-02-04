package com.issayah.samplecode;
import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args){
		
		/*
		 CONTROL STRUCTURES determine which code in your program runs
		 (there is often a lot of code written that never actually gets
		 executed when the code runs)
		 
		 If/Else statements allow programmers to control which code
		 gets executed.
		 
		 But before we talk about if statements we need to discuss boolean expressions
		*/
		
		 
		
		/*
		 BOOLEAN EXPRESSIONS:
		*/ 
		 boolean b1 = 5 > 4;
		 boolean b2 = 5 < (3+1);
		 
		 int x = 4, y = 6;
		// System.out.println(x + y);
		 boolean b3 = y > x + 2;
		
		 
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b3);

	
		
		 /* IF STATEMENTS
		 
		 if(boolean expression goes here){
		 	// if the expression is true this code runs
		 }
		 
		 */
		 if(b1) {
			 System.out.println("b1 is true");
		 }else {
			 System.out.println("b1 is false");
		 }

		
		 // note that the book does not always use curly braces with if statements
		 // BAD IDEA!
		
		
		 /* IF/ELSE STATEMENTS
		 
		 if(boolean expression goes here){
		 	// if the expression is true this code runs
		 }else{
		 	// if the expression is false, this code runs
		 }
		 
		 */
		 
		 

		 
		 
		 /* MULTI-BRANCH IF/ELSE STATEMENTS
		 
		 if(boolean expression goes here){
		 	//if the expression is true this code runs
		 }else if(boolean expression goes here){
		 	//if the above expression is true, this code runs
		 }else if(){
		 	//if the above expression is true, this code runs
		 }else{
		 	//if none of the expressions are true, this code runs
		 }
		 
//		 */
//		 
//		 Scanner kb = new Scanner(System.in);
//		 System.out.println("Enter your age");
//		 int age = kb.nextInt();
//		 
//		 if(age < 18) {
//			 System.out.println("You are young");
//		 }else if(age < 40 ) {
//			 System.out.println("You must be an adult, but not yet middle aged");
//		 }else if(age < 60) {
//			 System.out.println("You must be middle aged, but not yet old");
//		 }else {
//			 System.out.println("Time to retire");
//		 }
//		 
		 
		 
		 
		 /*
		 Comparison Operators
		 <
		 >
		 >=
		 <=
		 ==
		 !=
		 !
		 NOTE THAT THERE IS NO === OPERATOR IN JAVA
		 */
		 
		 // The equality operator
		 // (not to be confused with the assignment operator)
		 int num1 = 3, num2 = 3;
		 if(num1 == num2) {
			 System.out.println("num1 and num2 are equal");
		 }


		 // the negation operator (!)
		 if(num1 != num2) {
			 System.out.println("num1 and num2 are !equal");
		 }else {
			 System.out.println("They are still equal");
		 }
		 
		 
		 
		 /*
		 Logical Operators (you can use them to make 'compound boolean expressions'
		 &&   (AND operator)
		 ||   (OR operator)
		 */
		 int myAge = 26;
		 int yourAge = 20;
		 
		 if(myAge > 18 && yourAge > 18) {
			 System.out.println("We are both older than 18");
		 }
		 if(myAge > 25 && yourAge > 25) {
			 System.out.println("We are both older than 18");
		 }
		 
		 
		 /*
		 Parenthesis can make a difference
		 */
		 if(7 > 3 && (4 > 5 || 3 > 2)) {
			 System.out.println("something");
		 }

		 
		 //short-circuit evaluation (lazy evaluation)

		 
		 /*
		 NESTED IF STATEMENTS
		 (do the outer if statement first, then fill in the nested ones)
		 */
		 
		 
		

		 // NOW we need to talk about == vs .equals()
		 // You can use == for check to see if primitive data types have equal values
		 // But when you are comparing objects (class types) for equality
		 // it gets a little hairy!
		 
		 String myName = "Bob";
		 String yourName = "Bob";
		 if(myName.equals(yourName)) {
			 System.out.println("We both have the same name");
		 }else {
			 System.out.println("We don't have the same name");
		 }
		 
		 
		 
	}

}
