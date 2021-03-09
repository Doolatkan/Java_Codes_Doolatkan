package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of checks:");
		int check = scan.nextInt();
		double baseFee = 10.00; 		
		double checkFees =0;
		
		if(check>=1&&check<20) {
			checkFees = check * 0.1;
		}else if(check>=20&&check<40) {
			checkFees =check*0.08;
		}else if(check>=40&&check<60) {
			checkFees = check*0.06;
		}else if(check>=60) {
			checkFees = check*0.04;
		}else {
			System.out.println("Invalid input");
		}
		
		double serviceFee = checkFees + baseFee;
		System.out.println("Number of checks for the month: " + check);
		System.out.println("Bank's service fees for the month: $" + serviceFee);
	}

}
