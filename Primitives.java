
public class Primitives {
	
	// http://javadevnotes.com/java-integer-to-string-examples
	// http://javadevnotes.com/java-long-to-string-examples

	public static void main(String[] args) {
		
		/*
		 * Primitive data types
		 * byte			(1 byte)		For numbers 0-255
		 * short		(2 bytes)		
		 * int			(4 bytes)		For small whole numbers(max value is around 2 million)
		 * long			(8 bytes)		For large whole numbers
		 * float		(4 bytes)		For floating point numbers
		 * double		(8 bytes)		Never used it intentionally (it's for large floating pt numbers)
		 * boolean		(1 bit)			Can hold true or false
		 * char			(2 bytes)		For storing a single character
		 */
		
		// Step 1
		// Declare and initialize some primitive types
		// You have to specify the data type before the variable name:
		int myInt = 7;
		long myLong = 20000L;
		float myFloat = 10.4444F;
		double myDouble = 1111111111111111111111;


		// What's the diff between 5 and 5.0?
		// The first defaults to an int, the second defaults to a double
		// Note that all values that are larger than an int
		// are by default treated as doubles.
		// Thats why you need the L and F for longs and floats
		
		/*
		Note that primitive data types simply store a single value,
		whereas objects (class data types) can store properties and have methods.
		For example, the Dog class that we used to create 2 dog objects has two properties
		and 2 methods:
			
			Dog dog1 = new Dog();
			dog1.name = "Buster";
			dog1.bark();
				
		Note that dog1 is the variable that stores a Dog object.
		Class data types are also called 'reference types'
		*/
		
		// Step 2
		// a char is a single character and you must use SINGLE quotes around the value
		char myChar = 'x';
		
		// Step 3
		// a boolean data type can only hold a value of true or false
		boolean myBool = true;
		
		// Step 4
		// if you don't initialize the number primitives, they default to 0
		// if you don't initialize a boolean, it will default to false
		
		// this won't compile because you can't put a double or float into a int (remove the comment)
		//int x = 3.5;
		
		// but it's okay to assign a smaller value to a bigger variable...
		
		
		// Step 5
		// if you need to squeeze a bigger value into a smaller variable you can 
		// 'cast' it. But you may lose some information (the data gets 'truncated').
		
		
		// Step 6
		// You can use an expression to assign a value to a primitive variable:
		
		
		// or
		
		
		// Step 7
		// Here's where Java gets WEIRD and UGLY!
		// Note that when you want to use values that are floats, you should put an F
		// right after the value (because if you don't then Java will assume that all 
		// floating point values are doubles for some reason)
		
		
		// If you leave the F off, the compiler will complain that you are trying to
		// jam a double into a variable that whose data type is float
		
		// Step 8
		// You are supposed to also put an L after long values
		
		
		// Take the L off the end and see what happens when you compile
		
		// Here's the funny thing, if you take a 1 off of the end above and remove
		// and remove the L, everything will be OK. Any guesses as to why.
		
		// Step 9
		// Be careful when doing math and forgetting to use the F with floats!
		
		
		// WRONG: 9/5 will evaluate to 1 because 9 and 5 are both ints by default.
		// And in Java, when you divide two ints, the result will be an int
		// (in this case the decimal portion gets truncated)
        
        // instead you should do this:
        
		
        // Strangely, THIS WORKS because when you multiply a float by an int
        // the result is a float. So then when you divide that float by 5 
        // the result is a float! 
        
        
        //Note that there is inherent imprecision when you work with floating point numbers
        // ex: what is 1 divided by 3?
        // You don't have an infinite number of decimal places in Java like you do in real math
        
        // Step 10
        //If you overflow a primitive number, then weird things happen...
        
		
        //long myLong = 9223372036854775807;
  	
        
		
		// DON'T let this crap hold you back! Java is actually very cool,
		// but like any language, it has it's quirks!

		
  		// Step 11
  		// Let's talk about ARITHMETIC OPERATORS, 
		// there are a few types of operators and you already know how to use
		// most of the arithmetic operators, so lets talk about these:
		
		// Assignment Operator = 
		
		// Increment Operator ++
		
		// Decrement Operator --
		
		// Modulus Operator %		
	}

}
