package day13_methods_Part1;

import java.util.Scanner;

public class Task58_GraterNumber {

	public static void main(String[] args) {


		graterNumber();

	}

	public static void graterNumber() {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 + " is grater than " + num2);
		}else if(num2>num1) {
			System.out.println(num2 + " is grater than " + num1);
		}else {
			System.out.println(num1 + " and " + num2 + " are equal");
		}
		
	}

}
