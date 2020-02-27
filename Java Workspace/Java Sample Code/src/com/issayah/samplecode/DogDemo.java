package com.issayah.samplecode;

public class DogDemo {

	public static void main(String[] args)
	{
		Dog balto = new Dog();
		balto.setName("Balto");
		//balto.age = 8;
		balto.setAge(8);
		balto.setBreed("Siberian Husky");
		balto.writeOutput();
		
		balto.eat(5);
		balto.walk(6);
		System.out.println(balto.getEnergy());
		
		Dog scooby = new Dog();
		scooby.setName("Scooby");
		//scooby.age = 42;
		scooby.setAge(42);
		scooby.setBreed("Great Dane");
		System.out.println(scooby.getName() + " is a " + scooby.getBreed() + ".");
		System.out.println("He is " + scooby.getAge() + " years old, or ");
		int humanYears = scooby.getAgeInHumanYears();
		System.out.println(humanYears + " in human years.");
	}
	
}
