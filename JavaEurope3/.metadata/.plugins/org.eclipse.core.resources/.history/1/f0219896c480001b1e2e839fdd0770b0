package day22_stringManipulation_Lab;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first sting:");
		String str1 = scan.nextLine();
		System.out.print("Enter second sting:");
		String str2 = scan.nextLine();
		
		if(str1.equals("")|| str2.equals("")) {
			System.out.println("Str1 or str2 can not be empty");
		}else {
			System.out.println(makeAbba(str1,str2));
		}
	}

	public static String makeAbba(String str1, String str2) {

        return str1.concat(str2).concat(str2).concat(str1);
			
	}
}
