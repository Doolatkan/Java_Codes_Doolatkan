package day14_methods_Part2.Lab1;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.print("Enter a num1:");
       int num1 = scan.nextInt();
       System.out.print("Enter a num2:");
       int num2 = scan.nextInt();
       
       love6(num1,num2);

	}

	public static void love6(int num1, int num2) {


		if(num1==6 || num2==6||num1+num2==6||num1-num2==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
	

}
