package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question17_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = scan.nextLine();
		
		System.out.println(str + " is palindrome? " + isPalindromes(str));

	}

	public static String isPalindromes(String str) { 
		
		String str2 = "";
		
		for(int i=str.length()-1; i>=0;i--) {
			
			str2=str2+str.charAt(i);	
			
		}
		
		if(str2.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))) {
			return "Yes";
		}else {
			return "Not";
		}		
	}
	
	

}
