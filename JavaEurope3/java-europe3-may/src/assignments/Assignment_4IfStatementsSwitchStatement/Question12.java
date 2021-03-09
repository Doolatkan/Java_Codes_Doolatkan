package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter package type:");
		String packages = scanner.next();
		System.out.println("Enter number of hours:");
		double hours =scanner.nextDouble();
		double per = 0;
		switch(packages) {
		case "A":
			if(hours<=10) {
				per=9.95;
			}else {
			per = (hours-10)*2.00+9.95;}
			break;
		case "B":
			if(hours<=20) {
				per=13.95;
			}else {
			per = (hours-20)*1.00+13.95;}
			break;
		case "C":
			per = 19.95;
			break;
		default:
			System.out.println("Invalid input");
		}
		System.out.println("You choosed pakcage: " + packages + "\n The number of hours that were used: " + hours);
		System.out.println("Your total charges: $" + per);
	}
}

	

