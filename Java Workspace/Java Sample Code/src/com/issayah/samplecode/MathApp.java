package com.issayah.samplecode;
public class MathApp {

	public static void main(String[] args) {
		
		// instantiate a MathWizard object 
		MathWizard mw = new MathWizard();
		
		
		// invoke the add() method
		int x = 9, y = 6;
		int total = mw.add(x,y);
		
		// make it add again
		int newTotal = mw.add(total, 3);
		
		// see how many calculation the instance has done for us
		mw.showNumberOfCalculations();
		
		
		// try out the divide() method
		float answer = mw.divide(x, y);
		System.out.println(answer);
		
		// see how many calculation the instance has done for us
		mw.showNumberOfCalculations();
		
		// show that the numberOfCalculcations performed can become corrupted...
		//mw.numberOfCalculationsPerformed = 1000000;
		System.out.println(mw.getNumberOfCalculationsPerformed());
		mw.showNumberOfCalculations();
	}

}