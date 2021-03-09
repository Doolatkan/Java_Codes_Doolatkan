package review_session.week3;

import java.util.Scanner;

public class SeasonFindder {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter month:");
		int month = scanner.nextInt();
		
		switch(month) {
		
		case 3:
			System.out.println("It is spring");
			break;
		case 4:
			System.out.println("It is spring");
			break;
		case 5:
			System.out.println("It is spring");
			break;
		case 6: case 7: case 8:
			System.out.println("It is summer");
			break;
		default:
			System.out.println("Invalid month");
		
		
		}
	}

}
