package day14_methods_Part2.Lab1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);		
		System.out.print("Enter temperature:");
		int temp = scan.nextInt();
		System.out.print("Enter true if it is Summer and false otherwise:");
		boolean isSummer = scan.nextBoolean();
		
		deerPlay(temp,isSummer);

	}

	public static void deerPlay(int temp, boolean isSummer) {


		if(isSummer) {
			if(temp>=60&&temp<=100) {		
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(temp>=60&&temp<=90) {		
			    System.out.println(true);
		    }else  {
			    System.out.println(false);
		    }
		}
			
    }
		
}
	
	


