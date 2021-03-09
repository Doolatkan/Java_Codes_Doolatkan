package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = scan.nextLine();		
		System.out.println(countHi(str));
		
	}

	public static int countHi(String str) {
		int count = 0;
		char c1 = ' ';
		char c2 = ' ';
		for(int i=0; i<str.length();i++) {
			c1=c2;
			c2=str.charAt(i);		
			if(c1=='h' && c2=='i'){
				count++;
			}
		}
		return count;		
	}
	
}
