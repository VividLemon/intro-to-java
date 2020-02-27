package com.issayah.samplecode;

public class Dog {

	private String name;
	private String breed;
	private int age;
	private int energy;
	private int id;
	
	public void writeOutput()
	{
		System.out.println("Name: " + name);
		System.out.println("breed: " + breed);
		System.out.println("Age in calendar years: " + getAgeInHumanYears());
		System.out.println();
	}
	
	
	public int getAgeInHumanYears() {
		int humanAge = 0;
		if (age <= 2) {
			humanAge = age * 11;
		}else {
			humanAge = 22 + ((age-2) * 5);
		}
		return humanAge;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setAge(int newAge) {
		if(newAge > 0) {
			this.age = newAge;
		}else {
			System.out.println("Invalid age");
		}
	}
	public int getAge() {
		return this.age;
	}

	public int getEnergy() {
		return this.energy;
	}
	
	public void eat(int biscuits) {
		this.energy += (biscuits * 2);
	}
	public void walk(int walkUnit) {
		int newEnergy = this.energy -= (2*walkUnit);
		if(newEnergy > 0) {
			this.energy -= (2 * walkUnit);
		}else {
			System.out.println(this.name + " refuses to walk.");
		}	
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean equals(Dog d) {
		if(this.id == d.getId()) {
			return true;
		}else {
			return false;
		}
	}
	
}
