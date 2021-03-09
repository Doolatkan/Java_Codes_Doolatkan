package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		double tax1=150_000_000*0.25, tax2=(300_000_000-150_000_000)*0.3+tax1, tax3=(600_000_000-300_000_000)*0.35+tax2, tax4=(1_200_000_000-600_000_000)*0.40+tax3;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your income:");
		double income = scanner.nextDouble();
		double tax = 0.0;
		System.out.println("Your Income: " + income);
		if(income<=150_000_000) {
			tax = income*0.25;
			System.out.println("The tax amount you have to pay: " + tax);
		}else if(income>150_000_000 && income<=300+000_000) {
		tax = ((income-150_000_000)*0.3)+tax1;	
		System.out.println("The tax amount you have to pay: " + tax);
		}else if(income>300_000_000 && income<=600_000_000) {
			tax = ((income-300_000_000)*0.35)+tax2;	
			System.out.println("The tax amount you have to pay: " + tax);
		}else if(income>600_000_000 && income<=1_200_000_000) {
			tax = ((income-600_000_000)*0.4)+tax3;	
			System.out.println("The tax amount you have to pay: " + tax);
		}else if(income>1_200_000_000) {
			tax = ((income-1_200_000_000)*0.5)+tax4;	
			System.out.println("The tax amount you have to pay: " + tax);
		}	

	}

}
