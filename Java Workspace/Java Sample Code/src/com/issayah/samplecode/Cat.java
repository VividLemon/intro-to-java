package com.issayah.samplecode;
/*
Note's on Constructors...

The job of a constructor is to create an object of a specific CLASS data type
 (primitive data types do not have constructors)
 
 You must always use the 'new' keyword when using a constructor.
 
 Constructor methods are usually public, but they can be private in some cases.
 
 Constructor method names must always be the same name as the class that it instantiates.
 
 You never specify the return type of a constructor, it is implied by it's name
 (because it's name is always the same as the class that it instantiates)
 
 We commonly use parameters names for the constructor that are exactly the same as the
 instance variables in the class, and we use the 'this' keyword in the implementation of the
 constructor that distinguishes the parameters and the instance variables.
 
 Java will automatically create a 'default' constructor for you. This is why you have not had
 to create any constructors in any of the classes you've made so far. We have been using the default
 constructor that Java generates for us. Note that this default constructor does not have parameters.
 
 If you decide to create your own constructor, then you will also have to define
 the default constructor that takes no params.
 
 As you now can see, Java allows you to create different versions of constructor functions that have different paramters
 This is called overloading, and you can overload methods, just like you can overload constructor functions
 We'll talk more about 'method overloading' which we will take about more soon.


CLASS ACTIVITY...

Step 1 - 	Create a Cat class and add the following private instance variables:
 			id (int) 
 			name (String) 
 			breed (String) 
 			vaccinated (boolean)
 			
Step 2 - 	In the main() method use the default constructor to create a Cat or two
			Note that every class has a default constructor (which takes no parameters)
			
Step 3 - 	Add a constructor that takes params for each of the instance variables (except ID)
			Add a static variable that keeps track of all the cat objects created
			(You'll learn about static variables when you read chapter 6.2)
			In the constructor that we just created, increment numberOfCatsCreated and use that
			to assign an id.
			
			Note that the default constructor no longer works (there should be compile errors in main())

Step 4 - 	Explicitly add a 'default constructor' (The compile errors should go away)

Step 5 - 	Add another constructor that only has one param (to set the breed)

Notice that we now have 3 constructors, but only one of them actually increments numberOfCats and automatically sets the id

Step 6 - 	Let's use this() to link our constructors

Step 7 - 	In main() lets create a cat by using each of the constructor functions
			AND THEN USE THE DEBUGGER TO STEP THROUGH THE CODE AND SEE HOW this() IS USED 
			TO INVOKE THE CONSTRUCTOR THAT SETS THE ID

*/

public class Cat {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat("NAME", "BREED", true);
		Cat c3 = new Cat("tabby");
		System.out.println(Cat.numberOfCatsCreated);
	}
	
	private int id;
	private String name, breed;
	private boolean vaccinated;
	
	private static int numberOfCatsCreated;
	
	
	//constructors 
	public Cat(String name, String breed, boolean vaccinated) {
		this.name = name;
		this.breed = breed;
		this.vaccinated = vaccinated;
		numberOfCatsCreated++;
		
	}
	
	// add the default back in 
	public Cat() {
		this("No Name", "No Breed", false);
		
	}
	public Cat(String breed) {
		this.breed = breed;
		
	}

	
	
	
	
}