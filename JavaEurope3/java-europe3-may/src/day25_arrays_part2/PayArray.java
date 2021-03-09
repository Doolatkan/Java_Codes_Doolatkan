package day25_arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		
		//This program stores in an array the hours worked for by 5 employees who all make the same hourly wage. Calculate display their gross pay.
		
		Scanner scan = new Scanner(System.in);
		
		float[] hours = new float[5];
		
		for(int i=0; i<hours.length; i++) {
			System.out.print("Enter the hours worked by " + (i+1) + "-employee:");
			hours[i] = scan.nextFloat();
			while(hours[i]<0){
				System.out.print("Invalid input. Try it again:");
				hours[i] = scan.nextFloat();
			}
				
		}
		
		System.out.print("Enter the hourly rate for each employee:$");
		float rate = scan.nextFloat();
		
		while(rate<0){
			System.out.print("Wage can not be minus number. Try it again:");
			rate = scan.nextFloat();
		}
		
		for(int i=0; i<hours.length; i++) {
			System.out.println((i+1) + "-employee: " + hours[i] + " hours * $" + rate + " wage = $" + (hours[i]*rate) + " Gross wage");
		}		

	}

}
