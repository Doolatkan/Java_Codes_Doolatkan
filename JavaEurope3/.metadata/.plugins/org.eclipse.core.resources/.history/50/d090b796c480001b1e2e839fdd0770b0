package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string with at least 3char:");
		String str = scan.nextLine();
		while(str.length()<3) {
			System.out.print("Invalid input. Try it again:");
			str = scan.nextLine();			
		}
		System.out.println(hasBad(str));
	}

	public static boolean hasBad(String str) {
		
		boolean index = true;  
			     
	         if(str.length()>3) {
			       if(str.substring(0,3).equalsIgnoreCase("bad")|| str.substring(1,4).equalsIgnoreCase("bad")) {
				       index = true;
			       }else {
				       index = false;
			       }
		     }else {
		    	  if(str.substring(0,3).equalsIgnoreCase("bad")) {
				       index = true;
			      }else {
				       index = false;
			      }
		    }
	   
		return index;
	}
	
}
