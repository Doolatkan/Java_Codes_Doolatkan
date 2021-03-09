package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
        double BMI,mass,height;
        
    Scanner scan = new Scanner(System.in);
 
    System.out.println("Your weight in pounds:");
    int weightInPounds = scan.nextInt();
   
    System.out.print("Your height in feet followed by a space then additional inches:");
    int heightInFeet = scan.nextInt();
    int heightInInches = scan.nextInt();
    
       height = ((heightInFeet*12) + heightInInches) * 0.0254;
       mass = weightInPounds/2.2;
       BMI = mass /(height*height);
  
     System.out.println("Your weight in pounds: " + weightInPounds);
     System.out.println("Your height in feet followed by a space then additional inches: " + heightInFeet + " " + heightInInches);
     System.out.println("Your BMI is " + BMI);
  
    if(BMI<18.5) {
	  System.out.println("Your risk factory is: Underweight");
    }else if(BMI>=18.5 && BMI<25) {
	  System.out.println("Your risk factory is: Normal Weight");
    }else if(BMI>=25 && BMI<30) {
	  System.out.println("Your risk factory is: Overweight");
    }else if(BMI>=30) {
	  System.out.println("Your risk factory is: Obese");
    }


	}

}
