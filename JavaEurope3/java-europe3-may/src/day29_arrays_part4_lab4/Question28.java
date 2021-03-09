package day29_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter start number:");
		int start = scan.nextInt();
		System.out.print("Enter end number:");
		int end = scan.nextInt();
		
		while(start>end) {
			System.out.println("Start number cannot be greater than end number. Try it again:");
			System.out.print("Enter start number:");
			start = scan.nextInt();
			System.out.print("Enter end number:");
			end = scan.nextInt();
		}
		
		System.out.println("Output array:" + Arrays.toString(newArray(start, end)));
	}
	
	public static int[] newArray(int start, int end) {
		
		int[] array = new int[end-start];		 
		for(int i=0; i<array.length; i++) {
			array[i] = start;
			start++;
		}
		return array;
		
	}

}
