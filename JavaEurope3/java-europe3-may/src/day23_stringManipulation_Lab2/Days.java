package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String days[] = new String[7];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thirthday";
		days[4]="Friday";
		days[5]="Satuerday";
		days[6]="Sunday";
		
		System.out.print("Enter the day index:");
		int index = scan.nextInt();
		while(index<1 || index>7) {
			System.out.print("Invalid index. Try it again:");
			index = scan.nextInt();
		}
		System.out.println("Today is " + days[index-1]);
		

	}

}
