package review_session.week3;

import java.util.Scanner;

public class CheckPinCode {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Bank of America:");
		
		int secretPinCode = 2345;
		int pinCode = in.nextInt();
		
		if(secretPinCode == pinCode) {
			
			System.out.println("Welcome to your account!");
			
		}else {
			System.out.println("Invalid pincode");
		}
		System.out.println("Thank you for you business");
		
		
		

	}

}
