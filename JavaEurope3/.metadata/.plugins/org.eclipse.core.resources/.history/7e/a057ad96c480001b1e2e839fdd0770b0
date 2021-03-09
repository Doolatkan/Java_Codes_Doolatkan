package day23_stringManipulation_Lab2;

import java.util.Scanner;


public class Question11_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = scan.nextLine();
		System.out.println(countHi(str));

	}

//	public static int countHi(String str) {
//		int count = 0;
//		for(int i = 2; i<str.length()+1; i++) {
//			if(str.substring((i-2),i).equals("hi") ){				
//				count++;				
//			}
//		}		
//		return count;		
//	}
	public static int countHi(String str) {
		int count = 0;
		for(int i = 0; i<str.length()-1; i++) {
			if(str.substring(i,i+2).equals("hi") || str.substring(i,i+2).equals("Hi")){
				count++;				
			}
		}		
		return count;		
	}

}
