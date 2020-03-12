package com.issayah.samplecode;
public class HondaCivic {
	
	
	////////////////////////////////////////////////////////////////
	// main() - we'll use this for testing the HondaCivic class
	////////////////////////////////////////////////////////////////
	public static void main(String[] args) {

		// STEP 1
		// create 2 HondaCivic objects (h1 and h2)
		HondaCivic h1 = new HondaCivic(1, "Red");
		HondaCivic h2 = new HondaCivic(2, "Blue");
		
		
		
		
		// STEP 2
		// note that changing a static variable through one instance
		// changes it for all instances
//		h1.MPG = 100;
		System.out.println(h2.MPG);
		
		// STEP 3
		// In most cases, static fields are also constants
		// we shouldn't really be able to mess with the MAX_SPEED, MPG, MAX_SPEED
		// Go ahead and make them constants, you may have to comment out the code you wrote in step 2
		
		
		// STEP 4
		// Although you can access static member through an instance of an object, you shouldn't
		// Instead you should access it directly through the class (notice the warnings).
		// By doing it this way, we can avoid the overhead of instantiating
		// a new object
		// NOTE THAT WE DO NOT NEED TO INSTANTIATE A CLASS TO ACCESS A STATIC VARIABLE
		System.out.println(HondaCivic.MPG);
		
		// STEP 5
		// Let's add a static variable that keeps track of how many HondaCivics get instantiated
		// Then we'll add code to the constructor that increments the variable
		
		
		// Static Methods
		// Making methods static can help your programs to save RAM, because you do not need an object to call a static method
		// Instead you call a static method on a class (put the CLASS name before the dot, not a variable name).
		
		
		// So, you can call a static method without creating an object (by calling a constructor)
		// Remember that every time you call a constructor, an object is loaded into RAM
		
		// Static members (variables, constants, methods) get loaded into RAM by the JVM when it starts your app.
		// Before the JVM runs the main method, the 'class loader' looks at all the imported classes and loads the static members.
		// Then the code in the main() method runs and that's when your code starts instantiating objects (by calling constructor functions).
		// So static members have noting to do with any instances of objects.
		// BECAUSE OF THIS, YOU CANNOT REFER TO AN INSTANCE VARIABLE IN THE BODY OF A STATIC METHOD
		
		// STEP 6
		// Invoke the static method of the Honda class (you don't need an instance, you can invoke it directly on the class
		HondaCivic.calculateFuelForDistance(100);

		
	}
		
	
	///////////////////////////////
	// STATIC VARIABLES
	///////////////////////////////
	public static final int MPG = 40;
	public static final int MAX_SPEED = 120;
	public static final int FUEL_CAPACITY = 20;
	
	public static int numberOfInstances;
	
	///////////////////////////////
	// INSTANCE VARIABLES
	///////////////////////////////
	private String color;
	private int currentSpeed;
	private float fuel;
	private int id;
	
	// WHAT OBSERVATIONS CAN YOU MAKE ABOUT STATIC VS. INSTANCE VARIABLES????????	
	
	
	///////////////////////////////////////////////////////
	// CONSTRUCTORS
	///////////////////////////////////////////////////////
	public HondaCivic(int id, String color, int currentSpeed, float fuel) {
		this.id = id;
		this.color = color;
		this.currentSpeed = currentSpeed;
		this.fuel = fuel;
		
		numberOfInstances++;
	}
	
	public HondaCivic(int id, String color) {
		this(id, color, 0, 0f);
	}
	
	///////////////////////////////////
	// METHODS
	///////////////////////////////////
	public boolean accelerate() {
		if(fuel > 1 && currentSpeed <= (MAX_SPEED - 1)) {
			fuel--;
			currentSpeed++;
			return true;
		}
		return false;
	}
	public void decelerate() {
		if(currentSpeed >= 1) {
			currentSpeed--;
		}
	}
	public boolean addFuel(float gallons) {
		if((fuel + gallons) <= FUEL_CAPACITY){
			fuel += gallons;
			return true;
		}
		return false;
	}
	public static void calculateFuelForDistance(float distanceInMiles) {
		float gallonsNeeded = distanceInMiles / MPG;
		System.out.println("You'll need " + gallonsNeeded + " gallons.");
	}
	
	//////////////////////////////////////////////////////
	// SETTERS AND GETTERS
	// Note that currentSpeed and fuel are read-only. Why?
	//////////////////////////////////////////////////////
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNumberOfInstances() {
		return numberOfInstances;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public float getFuel() {
		return fuel;
	}
	
	
	
	
	
	
}