package com.issayah.samplecode;

public class Account {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private float balance;
	
	public Account(String firstName, String lastName, int accountNumber) {
		this(firstName, lastName, accountNumber, 0f);
	}
	public Account(String firstName, String lastName, int accountNumber, float balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public Account() {
		this("NO FIRST NAME", "NO LAST NAME", 0, 0F);
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setaccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public float getBalance() {
		return this.balance;
	}
	
	public void deposit(float amount) {
		this.balance += amount;
	}
	
	public void withdraw(float amount) {
		if(Math.signum((balance - amount)) == -1) {// Maybe add an equals method?
			System.out.println("NSF");
		}else {
		this.balance -= amount;
		}
	}
	
	public void getDetails() { // not sure if this is what you wanted, I sort of copied the writeOutput() from the dog class we created.
		System.out.println("Name: " + getFirstName() + " " + getLastName() + " Account: " + getAccountNumber() + " Balance: " + getBalance());
	}
	
	public boolean equals(Account otherObject) {
		return(this.firstName.equalsIgnoreCase(otherObject.firstName) &&
				this.lastName.equalsIgnoreCase(otherObject.lastName) &&
				this.accountNumber == otherObject.accountNumber &&
				this.balance == otherObject.balance
				);
				
	}
	
}
