package day22_stringManipulation_Lab;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string with at least 2 char:");
		String str = scan.nextLine();
		
		while(str.length()<2) {
			if(str.isEmpty()) {
				System.out.print("String can not be empty. Try it again:");
				str = scan.nextLine();	
			}else {
			    System.out.print("Invalid string. Try it again:");
			    str = scan.nextLine();
			}
		}
		
		System.out.println(right2(str));
	}

	public static String right2(String str) {
		
		return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
	}
	
	

}
