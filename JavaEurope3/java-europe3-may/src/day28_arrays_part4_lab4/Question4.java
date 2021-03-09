package day28_arrays_part4_lab4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = scan.nextInt();
		while(size<1) {
			System.out.print("Array size cannot be 0 or negative number. Try it again:");
			size = scan.nextInt();
		}
		
		int[] array = new int[size];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("Enter " + (i+1) + "-element:");
			array[i] = scan.nextInt();
		}
		
		System.out.println("sum = " + sum(array));

	}
	
	public static int sum(int[] arr) {
		int sum = 0;
		//1-way
//		for(int i=0; i<arr.length; i++) {
//			sum = sum + arr[i];
//		}
		
		//2-way
		for(int i : arr) {
			sum = sum + i;
		}		
		return sum;
	}

}
