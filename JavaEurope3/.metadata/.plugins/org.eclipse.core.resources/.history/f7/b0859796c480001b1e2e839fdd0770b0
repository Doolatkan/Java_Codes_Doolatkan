package day22_stringManipulation_Lab;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter strint whith at least 2 char:");
		String str = scan.nextLine();
		
		while(str.length()<2) {
			System.out.print("Invalid string. Try it again:");
			str = scan.nextLine();
		}
		
		System.out.println(frontAgain(str));
	}

	public static boolean frontAgain(String str) {
		
		if(str.substring(0,2).equals(str.substring(str.length()-2))){
			return true;
		}else {
			return false;
		}
		

	}
	
	

}
