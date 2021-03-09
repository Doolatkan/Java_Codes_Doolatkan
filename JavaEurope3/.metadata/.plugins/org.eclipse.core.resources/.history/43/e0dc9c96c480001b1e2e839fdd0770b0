package day22_stringManipulation_Lab;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string1:");
		String str1 = scan.nextLine();
		System.out.print("Enter string2:");
		String str2 = scan.nextLine();
		
		System.out.println(comboString(str1,str2));
	}

	public static String comboString(String str1, String str2) {
		
		if(str1.length()>str2.length()) {			 
			return str2.concat(str1).concat(str2);
		}else if(str1.length()<str2.length()){
			return str1.concat(str2).concat(str1);
		}else {
			return "Strings are equal";
		}
		
	}
	
	

}
