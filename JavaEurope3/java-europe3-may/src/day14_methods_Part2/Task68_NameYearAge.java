package day14_methods_Part2;

import java.util.Scanner;

public class Task68_NameYearAge {

	public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your name: ");
      String name = scan.next();
      
      System.out.print("Enter your birth year: ");
      int birthYear = scan.nextInt();
      
      System.out.print("Enter a current year: ");
      int currentYear = scan.nextInt();
      
      yearsUntilRetirement(name, calculateAge(birthYear, currentYear)); 
      
	}	

	public static int calculateAge(int birthYear, int currentYear) {		
		int age = currentYear - birthYear; 		
		return age;
	}
	
	public static void yearsUntilRetirement(String name, int age) {		 
		int retirementAge = 65 - age;		
		System.out.println(name + " retires in "  + retirementAge + " years");
	}
	
	
	

}
