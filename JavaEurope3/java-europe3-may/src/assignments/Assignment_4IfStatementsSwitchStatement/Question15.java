package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		
		switch(num) {
		case 0: case 1: case 2:
			System.out.println(num + " is Low Number");
			break;
		case 3: case 4: case5:
			System.out.println(num + " is Medium Number");
	    	break;
	    default:
	    	System.out.println(num + " is Other Number");
		}

	}

}
