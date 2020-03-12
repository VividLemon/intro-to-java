package com.issayah.samplecode;


public class Employee {

	// STEP 1  - Static Members
	public static final float MAX_SALARY = 200000F;
	public static final float MIN_SALARY = 40000F;
	
	// STEP 2 - Instance Variables
	private long id;
	private String firstName;
	private String lastName;
	private int age; 			// must be greater than 0 and less that 120
	private float salary; 		// must be within the salary range
	
	
	//private Date dateHired; // must not be in the future
	//private Date birthday; // must be over 18 years old
	
	// STEP 3
	// Getters/Setters  - Generate them via Eclipse and then go to EmployeeApp
	
	// STEP 4 - create the displayEmployee() method (using the String.format() method)
	// Go into the EmployeeApp class and create an employee or two and see that we can corrupt the data
	// then we'll come back and do step 4 here and add logic to the setters and getters
	
	// Step 5
	// Setter for id must be greater than 0
	// Setter for age must make sure that age is greater than 0 and less than 100
	// Setter for salary must be within the  valid range
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		
		if(id < 0) {
			System.out.println("Id must be greater than 0");
			return;
		}
		
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		
		if(salary >= MIN_SALARY && salary <= MAX_SALARY ) {
			this.salary = salary;
		}else {
			System.out.println("salary is not within the valid range");
		}
		
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 0 || age < 100) {
			this.age = age;
		}else {
			System.out.println("Age must be greater than 0");
			return;
		}
		
	}
	
	/*
	public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	 */
	
	
	public String displayEmployee() {
		String str = String.format("ID: %d - Name: %s %s Salary: %.2f Age %d",this.id, this.firstName, this.lastName, this.salary, this.age);
		return str;
	}
	
	
	
	// add a method isEligibleForPensionPlan
	// if they have worked for more than 2 years AND were under the age of 55 when hired
	// play with the set/get methods to compare passing primitives vs objects as params
	
	
	
	// For later
	// private Address address;
	
	// Add an enum for department
	// Make the dept an array of enum
	
	// add a projects ivar (array of strings)
	
	
	
	
	
	/*
	// Constructors
	public Employee(long id, String firstName, String lastName, Date dateHired, float salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateHired = dateHired;
		this.salary = salary;
	}
	*/
	
	
}