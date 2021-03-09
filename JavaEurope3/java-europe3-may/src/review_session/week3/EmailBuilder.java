package review_session.week3;

import java.util.Scanner;

public class EmailBuilder {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to your new Company!");
		System.out.println("Enter first name, last name, company name:");
		String  firstName = scan.nextLine();
		String  lastName = scan.next();
		String  companyName = scan.next();
		
		String email = firstName + "_" + lastName + "@" + companyName + ".com";
		
		
		System.out.println("Your email: " + email);
		

	}

}
