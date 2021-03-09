package day20_stringManipulation_part2;

import java.util.Scanner;

public class Task81_TimeStamp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date in next format(mm/dd/yyyy hh:mm:ss)");
		String date = scan.nextLine();
		
		System.out.println(timeStamp(date));

	}

	public static String timeStamp(String date) {
        
        	date = date.replace("/", "").replace(" ", "").replace(":", "");       	
        
        	return date;		
	}

}
