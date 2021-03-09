package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = scan.nextLine();
		
		while(str.isEmpty()) {
			System.out.print("Invalid string. Try it again:");
			str = scan.nextLine();
		}
		System.out.println(atFirst(str));
	}

	public static String atFirst(String str) {
		
		if(str.length()>=2) {
			return str.substring(0,2);
		}else {
			return str.substring(0).concat("@");
		}
		
	}
	
	

}
