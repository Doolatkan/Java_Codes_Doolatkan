package day27_arrays_part4_lab4;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int num = scan.nextInt();
		while(num<1) {
			System.out.print("Number of size cannot be 0 or negative. Try it again:");
			num = scan.nextInt();
		}
		
		int[] numbersArray = new int[num];
		
		for(int i=0; i<numbersArray.length; i++) {
			System.out.print("Enter " + (i+1) + " element number:");
			numbersArray[i] = scan.nextInt();			
		}	
		
		System.out.println(is6Appears(numbersArray));	
	}
	
	public static boolean is6Appears(int[] numbersArray) {
		
		if(numbersArray[0]==6 || numbersArray[numbersArray.length-1]==6) {			
			return true;
		}
		return false;
	}

}
