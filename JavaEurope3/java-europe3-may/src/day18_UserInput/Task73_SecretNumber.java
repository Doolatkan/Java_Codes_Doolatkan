package day18_UserInput;

import java.util.Scanner;

public class Task73_SecretNumber {

	public static void main(String[] args) {	
		int sec = 15;		
		int guessSec;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number between 1-20:");
		do {
			guessSec = scan.nextInt();
			if(guessSec<1 || guessSec>20) {
				System.out.println("Enter only number between 1-20");
			}else if(guessSec<sec) {	    
			        System.out.print("Enter bigger number");
			    }else if(guessSec>sec) {
			        System.out.print("Enter smaller number");	
			    }else {
				    System.out.print("Congrat, you got it....");
			    }	
		    
	    }while(guessSec != sec);
		           
	
	}
}
	

