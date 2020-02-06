package com.issayah.samplecode;
import java.util.Scanner;

public class SwitchCase {
	
	enum AgeGroup{
		INFANT, 
		ADOLESCENT,
		ADULT,
		SENIOR,
	}
	
    public static void main(String[] args) {
       
    	
    	
        // Switch case statements are a lot like IF statements
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you like pizza? (yes or no?)");
        String input = keyboard.next();
        // we could accomplish the same thing with this switch/case statement
        
        if(input.equalsIgnoreCase("yes")) {
        	System.out.println("Here's your pizza");
        }else if (input.equalsIgnoreCase("no")){
        	System.out.println("How can you not like pizza");
        }else {
        	System.out.println("You need to answer yes or no");
        }
       
        // 
        switch(input.toLowerCase()) {
        case "yes": 
        	System.out.println("Here's your pizza");
        	break;
        case "no": 
        	System.out.println("How can you not like pizza");
        	break;
        default: 
        	System.out.println("It was a yes/no question");
        	break;
        }
        
        
        
        // sometimes it's helpful to omit the break statement
        // which is a lot like using a compound boolean expression in an IF statement
        switch(input.toLowerCase()) {
        case "yes": 
        case "y":
        	System.out.println("Here's your pizza");
        	break;
        case "no":
        case "n":
        	System.out.println("How can you not like pizza");
        	break;
        default: 
        	System.out.println("It was a yes/no question");
        }
    	
        // go ahead and write and IF statement that accomplishes the same thing
        // as the switch/case above
        if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
        	System.out.println("Here's your pizza");
        }else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")){
        	System.out.println("How can you not like pizza");
        }else {
        	System.out.println("You need to answer yes or no");
        }       
       
        // Switch case statements work well with ENUMs (enumerated data types)
        // So let's talk about them before we show how to use them with switch case statements
        // (but they cannot be declared inside of a method, so we'll declare it above
        // and then come back here to use it)
        // Note that you might also want to put enums in their own file
        // (look in the bin dir and you'll see that the compiler separates AgeGroup into it's own class file)
       
        AgeGroup ag = AgeGroup.INFANT;
       
       AgeGroup yourAge = null;
       
        // When you create an enum, it's sort of like creating a very crude/simple class
        // You are actually creating data type, just like when you create a class
               
       System.out.println("Enter your age");
       int age = keyboard.nextInt();
       
       if(age < 10) {
    	   yourAge = AgeGroup.INFANT;
       }else if( age < 18) {
    	   yourAge = AgeGroup.ADOLESCENT;
       }else if(age < 65) {
    	   yourAge = AgeGroup.ADULT;
       }else {
    	   yourAge = AgeGroup.SENIOR;
       }
       
        // Now let's use an enum with a switch/case statement
       switch(yourAge) {
       case INFANT:
    	   System.out.println("Just a young pup");
    	   break;
       case ADOLESCENT:
    	   System.out.println("It's tough being an adolescent");
    	   break;
       case ADULT:
    	   System.out.println("All grown up!");
    	   break;
       case SENIOR:
    	   System.out.println("Over the hill");
    	   break;
       }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        //WHAT COULD YOU DO IF THERE WERE NO ENUMS???
       System.out.println("Enter your age");
       age = keyboard.nextInt();
       String ageGroup = null;
       if(age < 10) {
    	   ageGroup = "INFANT";
       }else if( age < 18) {
    	   ageGroup = "ADOLESCENT";
       }else if(age < 65) {
    	   ageGroup = "ADULT";
       }else {
    	  ageGroup = "SENIOR";
       }
       
        // But by using a string instead of an enum, I might introduce bugs into the code
       
    }

}