package day18_UserInput;

import java.util.Scanner;

public class Task72_TotalOfNumbers {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        System.out.println("Total of numbers: " + num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));

	}

}
