package com.issayah.samplecode;
public class Params2 {

	public static void main(String[] args) {
		
		// Example 1 - Passing a primitive into a method
		float salary1 = 50000F;
		doubleSalary(salary1);
		// even though the doubleSalary() method alters the param pass in, the original copy is unchanged
		System.out.println(salary1);
		
		// Example 2 - Passing an object (reference type) into a method
		Employee e = new Employee();
		e.setSalary(50000F);
		doubleSalary(e); // we are passing in a copy of the memory address to the object referred to by e
		System.out.println(e.getSalary());
		
		
	}
	
	public static void doubleSalary(float salaryParam) {
		salaryParam *= 2;
		System.out.println("New salary: " + salaryParam);
	}
	
	public static void doubleSalary(Employee employeeParam) {
		employeeParam.setSalary(employeeParam.getSalary() * 2);
	}

}