package day22_stringManipulation_Lab;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = scan.nextLine();
		
		System.out.println(extraEnd(str));
				
	}

	public static String extraEnd(String str) {
		
		if(str.length()<2) {
			return "Invalid String";
		}
		
		String extraEnd = "";
		extraEnd = str.substring((str.length()-2)); 		
		return extraEnd.concat(extraEnd).concat(extraEnd);
		
	}
	
	

}
