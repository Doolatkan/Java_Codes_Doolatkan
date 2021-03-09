package day18_UserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a byte value: ");
		byte b1 = scan.nextByte();
		
		System.out.println("Entered byte: " + b1);
		System.out.println("Multiplication: " + b1*4);
		System.out.println("Modul:" + b1%3);
		
		System.out.print("Enter a short value: ");
		short s1 = scan.nextShort();
		System.out.println("Short value is " + s1);
		
		System.out.print("Enter a int value: ");
		int i1 = scan.nextInt();
		System.out.println("Int value is " + i1);
		
		System.out.print("Enter a long value: ");
		long l1 = scan.nextLong();
		System.out.println("Long value is " + l1);
		
		System.out.print("Enter a double value: ");
		double d1 = scan.nextDouble();
		System.out.println("Double value is " + d1);
		
		System.out.print("Enter a boolean value: ");
		boolean bool = scan.nextBoolean();
		System.out.println("Boolean value is " + bool);
		
		System.out.print("Enter a string value: ");
		String str = scan.next();
		System.out.println("String value is " + str);

	}

}
