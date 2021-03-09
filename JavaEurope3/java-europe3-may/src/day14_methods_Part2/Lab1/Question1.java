package day14_methods_Part2.Lab1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string and a non-negative number:");
		String str = scan.next();
		int num = scan.nextInt();
		if(num<0) {
			System.err.println("Invalid input");
		}
		
		stringTimes(str, num);

	}

	public static void stringTimes(String str, int num) {


		String strn = "";
		for(int i=0;i<num;i++ ) {
			strn  =strn + str;
			
		}
		System.out.println(strn);
		
	}
	

}
