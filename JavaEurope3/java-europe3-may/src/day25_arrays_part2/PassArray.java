package day25_arrays_part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		
		//create an array
		int[] numbers = new int[4];
		
		showArray(numbers);
		//pass the array to the getValues method
		
		getValues(numbers);
		
		System.out.println("Here are the numbers that you entered");
		
		//pass the array to showArray method
		
		showArray(numbers);
		
		String[] str1 = {"apple", "Orange", "kiwi"};
		String[] str2 = str1;
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

	}
	


	public static void getValues(int[] array) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a series of " + array.length + " numbers");
		
		for(int i=0; i<array.length; i++) {
			System.out.print("Enter number " + (i+1) + ":");
			array[i] = scan.nextInt();	
		}
		
		
	}
	
	
	public static void showArray(int[] array) {
		
		for(int value : array) {
			
		    System.out.println(value);
		    
		}
		
	}	

}
