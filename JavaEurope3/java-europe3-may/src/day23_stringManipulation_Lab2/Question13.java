package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter strin:");
		String str = scan.nextLine();		
		System.out.println(doubleChar(str));
	}

	public static String doubleChar(String str) {
		String concat1 = "";
		for(int i=0;i<str.length();i++) {
			char concat = str.charAt(i);			
			concat1=concat1+concat+concat;			
		}		
		return concat1;		
	}
}
