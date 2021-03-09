package day29_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = scan.nextInt();
		while(size<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again:");
			size = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(printLengthArray(size)));	

	}
	
	public static int[] printLengthArray(int number) {
		
		int[] array = new int[number];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i;
		}
		
		return array;
	}

}
