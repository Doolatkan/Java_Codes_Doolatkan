package day22_stringManipulation_Lab;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string of even length:");
		String evenLength = scan.nextLine();		
		
			while(evenLength.length()%2!=0) {
				System.out.print("Invalid length. Try it again:");
				evenLength = scan.nextLine();
			}
			System.out.println(firstHalf(evenLength));
	}

	public static String firstHalf(String evenLength) {		
		
			return evenLength.substring(0,(evenLength.length()/2));	
	}

}
