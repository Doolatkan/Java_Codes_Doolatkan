package review_session.week5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of room:");
		int numberOfBedRooms = scan.nextInt();
		leasingOffice(numberOfBedRooms);
		System.out.println("Starting prise is: " + leasingOffice(numberOfBedRooms));
		int monthlyIncome = 3000;
		double net = monthlyIncome - (leasingOffice(numberOfBedRooms)+ calculateExpenses(numberOfBedRooms));
		System.out.println("Invoice :" + net);

	}
	
	public static int leasingOffice(int numberOfBedRooms) {
		int startingPrice = 0;
		if(numberOfBedRooms==1) {
			startingPrice = 1100;
		}else if(numberOfBedRooms==2) {
			startingPrice = 1850;
		}else if(numberOfBedRooms==3) {
			startingPrice = 2550;
		}

		return startingPrice;
	}
	
	public static double calculateExpenses(int numberOfBedRooms) {
		
		
		
		return leasingOffice(numberOfBedRooms)*0.50;
	}

}
