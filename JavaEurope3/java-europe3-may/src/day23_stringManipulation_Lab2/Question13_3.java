package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question13_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter strin:");
		String str = scan.nextLine();		
		System.out.println(doubleChar(str));
	}

	public static String doubleChar(String str) {
		String concat = "";
		for(int i=0;i<str.length();i++) {
						
			concat = concat + str.substring(i, i+1).concat(str.substring(i,i+1));			
		}		
		return concat;		
	

	}

}
