package review_session.week2;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number:");
		
		int x = scanner.nextInt();
		System.out.println("Your number is: " + x);
		
		System.out.println("Enter your second number: ");
		
		int x1 = scanner.nextInt();
		
		System.out.println("Your second number is: " + x1);
		int y= x+x1;
		System.out.println("Summ is = " + y);

	}

}
