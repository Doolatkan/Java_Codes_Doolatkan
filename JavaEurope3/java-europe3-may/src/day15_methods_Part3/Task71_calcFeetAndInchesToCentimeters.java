package day15_methods_Part3;

import java.util.Scanner;

public class Task71_calcFeetAndInchesToCentimeters {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Enter feet: ");
		double feet = scan.nextDouble();
		
		System.out.print("Enter inches: ");		
		double inches = scan.nextDouble();
		
		
		
		System.out.print("Enter inches2: ");
		double inches2 = scan.nextDouble();


		calcFeetAndInchesToCentimeters(feet,inches);
		calcFeetAndInchesToCentimeters(inches2);		
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
		
		
		if(feet>=0 && inches>=0 && inches<=12) {
			double centimeters = ((feet*12)*2.54)+(inches*2.54);
			System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters");
			 return centimeters;
			 
		}else {
			
			System.out.println("Invalid feet or inches");
			return -1;
		}
	}
	
	
	
	
	
	public static double calcFeetAndInchesToCentimeters(double inches2) {
		if(inches2>=0) {
			double feet = (int)inches2/12;
			double remainderInches =inches2%12;
			System.out.println("\n"+inches2 + " inches = " + feet + " feet, " + remainderInches + " inches");
			return (calcFeetAndInchesToCentimeters(feet,remainderInches));
			
		}else {
			System.out.println("Invalid inches");
			 return -1;
		}
	}

}
