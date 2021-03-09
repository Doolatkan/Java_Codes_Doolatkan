package day28_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = scan.nextInt();
		while(size<1) {
			System.out.print("Array cannot be 0 or negative. Try it again:");
			size = scan.nextInt();
		}
		
		int[] array = new int[size];
		for(int i=0; i<array.length; i++) {
			System.out.print("Enter " + (i+1) + "-element:");
			array[i] = scan.nextInt();
		}
		
		System.out.println("Input array: " + Arrays.toString(array));
		System.out.println("Output array: " + Arrays.toString(doubleLength(array)));

	}
	
	public static int[] doubleLength(int[] arr) {
		
		int[] arrayNew = new int[arr.length*2];
		arrayNew[arrayNew.length-1]=arr[arr.length-1];
		
		return arrayNew;
		
	}

}
