package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = scan.nextLine();
		
		System.out.println(str + " is palindrome? " + isPalindromes(str));
	}

	public static String isPalindromes(String str) {
		String yesno = "Not";
		String concat = "";
		if(str.length()%2==0) {
			yesno = "Not";		
		
		}else {
			for(int i=str.length()-1;i>=0;i--) {
				concat=concat+str.charAt(i);
			}
			if(str.substring(0).equalsIgnoreCase(concat)) {
				yesno= "Yes";
			}else {
				yesno= "Not";
			}
		}
		
		return yesno;
	}
}
	
	


