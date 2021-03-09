package day29_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = scan.nextInt();
		while(size<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again:");
			size = scan.nextInt();			
		}
		int[] array = new int[size];
		for(int i=0; i<array.length; i++) {
			System.out.print("Enter " + (i+1) + "-element of array:");
			array[i] = scan.nextInt();
		}
		
		System.out.print("Difference between the largest and smallest value in the array:" + Arrays.toString(array));
		System.out.println(" = " + (differenceLargestSmallest(array)));		

	}
	
	public static int differenceLargestSmallest(int[] arr) {
		
		int max = arr[0];
		int min = arr[0];
		
		for(int val : arr) {
			if(max<val) {
				max = val;
			}
			
			if(min>val) {
				min = val;
			}
		}
		
		return max-min;
	}

}
