package day14_methods_Part2;

import java.util.Scanner;

public class Task67_TheSameLastDigit {

	public static void main(String[] args) {


		Scanner scan =new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(lastDigit(num1,num2)) {
		System.out.println("Numbers " + num1 + " and " + num2 + " are have the same last digit.");
		}else {
			System.out.println("Numbers " + num1 + " and " + num2 + " are don't have the same last digit.");
		}

	}

	public static boolean lastDigit(int num1, int num2) {

		if(num1%10==num2%10) {
		    return true;	
		}else {
			return false;
		}
		
		
	}
	
	

}
