package com.issayah.samplecode;
public class WrapperClasses {

	public static void main(String[] args) {
		/*
		http://www.w3resource.com/java-tutorial/java-wrapper-classes.php
		Each of Java's eight primitive data types has a class dedicated to it. 
		These are known as wrapper classes because they "wrap" the primitive data type into an object of that class. The wrapper classes are part of the java.lang package, which is imported by default into all Java programs. 
		
	    To provide a mechanism to ‘wrap’ primitive values in an object so that primitives can do activities reserved for the objects like being added to ArrayList, Hashset, HashMap etc. collection.
	    
	    To provide an assortment of utility functions for primitives like converting primitive types to and from string objects, converting to various bases like binary, octal or hexadecimal, or comparing various objects.
		*/
		
		// Step 1 - create an instance of the Integer (wrapper) class
		Integer x = new Integer(12);
		
		// Step 2
		// The wrapper classes have static methods that we can use to convert (cast) data types
		
		// Convert the string "TRUE" into a Boolean
		boolean isReal = Boolean.parseBoolean("TRUE");
		
		// Convert the string "1" into an Integer
		
		double bigMoney = Double.parseDouble("550000000");
		//System.out.println(bigMoney);
		
		
		// Convert a String to a double
		
		
		
		// What happens if the value can not be parsed?
		
		// Step 3 - auto-boxing
		// You can assign an Integer value to an int data type and
		// Java will do the conversion for you. Java allows you
		// to convert to and from wrapper classes and their associated
		// primitive data types automatically. 
		// This is known as 'auto-boxing'
		
		
		
		// Step 4
		// Note that the constructors are overloaded so that you can pass a String
		// (or other data types in as a parameter)

		
		//This can now lead us to our discussion about overloading methods...
				
		
	}
}