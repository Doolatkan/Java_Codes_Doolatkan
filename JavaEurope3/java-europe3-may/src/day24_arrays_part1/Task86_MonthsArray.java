package day24_arrays_part1;

import java.util.Scanner;

public class Task86_MonthsArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] months = new String[12];
		months[0] = "January";
		months[1] = "Febuary";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		System.out.print("Enter month index between 1-12:");
		int index = scan.nextInt();
	    
		while(index<1 || index>12) {
			System.out.print("Invalid input. Try it again:");
			index = scan.nextInt();
		}
		System.out.println(months[index-1]);

	}

}
