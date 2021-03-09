package day22_stringManipulation_Lab;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string with at least 2 characters:");
		String str = scan.nextLine();
		
		while(str.length()<2) {
			System.out.print("Invalid string. Try it again:");
			str = scan.nextLine();		
		}
			System.out.println(withoutEnd(str));
	}

	public static String withoutEnd(String str) {		
		
		return str.substring(1, str.length()-1);
	}
	
	

}
