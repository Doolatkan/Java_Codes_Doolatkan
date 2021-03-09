package day13_methods_Part1;

import java.util.Scanner;

public class Task57_SumOf3Numbers {

	public static void main(String[] args) {

        sumOf3Numbers();		

	}

	public static void sumOf3Numbers() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        int sum = num1 + num2 + num3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);		
		
	}

}
