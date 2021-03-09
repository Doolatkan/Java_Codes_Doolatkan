package day10_controlFlowStatements_Part4;

import java.util.Scanner;

public class Task45_LargestNumber {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of steps:");
		int steps = scan.nextInt();
		System.out.println("Enter 2 values:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		for(int st = 0; st<=steps; st++) {	
	
		if(num1!=num2) {
			if(num1>num2) {
				System.out.println("number " + num1 + " is largest than number " + num2);
			}else {
				System.out.println("number " + num2 + " is largest than number " + num1);
			}
		}else {
			System.out.println("numbers " + num1 + " and " + num2 + " are equal");
			
		}
		}
		

	}

}
