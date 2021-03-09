package day22_stringManipulation_Lab;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string with at least 2 char:");
		String str = scan.nextLine();
		
		while(str.length()<2) {
			System.out.println("Invalid string. Try it again:");
			str = scan.nextLine();
		}		
		System.out.println(left2(str));
	}

	public static String left2(String str) {	
		
			return str.substring(2).concat(str.substring(0,2));		
		
	}
	
	

}
