package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of books that you have purchased this month:");
		int numBook = scan.nextInt();
		int points = 0;
		if(numBook<0) {
			System.out.println("Invalid input");
		}else if(numBook==0) {
			System.out.println("Purchases: " + numBook + " books, \nEarns: " + points + " points.");
		}else if(numBook==1) {
			points = 5;
			System.out.println("Purchases: " + numBook + " books, \nEarns: " + points + " points.");
		}else if(numBook==2) {
			points=15;
			System.out.println("Purchases: " + numBook + " books, \nEarns: " + points + " points.");
		}else if(numBook==3) {
			points = 30;
			System.out.println("Purchases: " + numBook + " books, \nEarns: " + points + " points.");
		}else if(numBook>=4) {
			points = 60;
			System.out.println("Purchases: " + numBook + " books, \nEarns: " + points + " points.");
		}
		
		
		
	}

}
