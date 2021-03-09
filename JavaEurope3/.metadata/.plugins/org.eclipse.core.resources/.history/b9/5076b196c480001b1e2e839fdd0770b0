package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question13_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter strin:");
		String str = scan.nextLine();		
		System.out.println(doubleChar(str));
	}

	public static String doubleChar(String str) {
		String concat ="";
		int i=0;
		while(i<str.length()) {
			concat= concat + str.substring(i,i+1).concat(str.substring(i, i+1));
			i++;
		}	
		return concat;	
	}
}
