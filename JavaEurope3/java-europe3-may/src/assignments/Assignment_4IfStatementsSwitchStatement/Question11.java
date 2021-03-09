package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter variable  medium:");
		String medium =scan.next();
		System.out.println("Enter a distance:");
		double distance = scan.nextDouble();
		double time = 0;
		
		switch(medium) {
		case "air":
		case "Air":
			time=distance/1100;
			break;
		case "water":
		case "Water":
			time=distance/4900;
			break;
		case "steel":
		case "Steel":
			time=distance/16400;
			break;
			default:
				System.out.println("Invalid medium!!!\nEnder one of next:\" air\",\" Air\\\",\" water\\\",\" Water\\\",\" steel\\\",\" Steel\",");
		}
		System.out.println("Input medium: " +"\""+ medium + "\"" + " , distance: " + distance);
		System.out.println("The amount of time it will take: " + time + "seconds");
	}

}
