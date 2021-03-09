package day18_UserInput;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int i1 = scan.nextInt();
		
		System.out.print("Enter second number:");
		int i2 = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("Enter a string:");
		String str = scan.nextLine();
		
		System.out.println("Output:" + i1 + ":" + i2 + ":" + str);

	}

}
