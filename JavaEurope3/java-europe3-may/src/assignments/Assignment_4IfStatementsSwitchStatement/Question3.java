package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = scanner.nextInt();
		
			
		
	if((year%4==0 && year%100!=0) ||year%400==0) {
		System.out.println(year + " Leap Year");
	}
	else {
		System.out.println(year + " Not a leap Year");
	}
		}
		
	}


