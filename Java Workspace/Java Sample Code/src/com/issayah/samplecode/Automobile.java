package com.issayah.samplecode;

public class Automobile {

	private double fuel;
	private double speed;
	private String license;
	
	public void accelerate(double pressure) {
		if(pressure > 10) {
			this.speed += 5;
		}else {
			this.speed += 2;
		}
		
	}
	public void decelerate(double pressure) {
		if(pressure > 10) {
			this.speed -= 5;
		}else {
			this.speed -= 2;
		}
	}
	public void showSpeed() {
		System.out.println("Current speed: " + this.speed);
	}
	
}
