package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter mass of object in kg:");
		int mass = scan.nextInt();
		double weightInNewtons = mass*9.8;
		
		if(weightInNewtons>1000) {
			System.out.println("Weight of object is: " + weightInNewtons + " Newtons, it is too heavy");
		}else if(weightInNewtons<10){
			System.out.println("Weight of object is: " + weightInNewtons + " Newtons, it is too light");
		}else {
			System.out.println("Weight of object is: " + weightInNewtons + " Newtons");
		}
 
	}

}
