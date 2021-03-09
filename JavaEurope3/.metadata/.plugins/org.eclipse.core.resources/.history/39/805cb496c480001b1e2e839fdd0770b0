package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = scan.nextLine();
		
        while(str.length()<2) {
			System.out.print("Invalid string. Try it again:");
			str = scan.nextLine();
		}
		System.out.println(endsLy(str));		
	}

	public static boolean endsLy(String str) {		
		
		if(str.substring(str.length()-2).equals("ly")) {
			return true;
		}else {
			return false;
		}
		
		
	}
	

}
