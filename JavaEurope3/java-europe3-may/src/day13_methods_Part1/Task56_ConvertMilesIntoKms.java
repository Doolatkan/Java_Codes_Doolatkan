package day13_methods_Part1;

import java.util.Scanner;

public class Task56_ConvertMilesIntoKms {

	public static void main(String[] args) {        
    
        convertKM();
        convertKM();

	}

	public static void convertKM() {

		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter number of miles:");
        double miles = scan.nextDouble();        
		double kms = miles*1.609344;
		kms = Math.round(kms*100.0)/100.0;
		System.out.println(miles + " miles = " + kms);
		
	}

}
