package day28_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array1:");
		int size1 = scan.nextInt();
		while(size1<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again:");
			size1 = scan.nextInt();
		}
		int[] array1 = new int[size1];
		for(int i=0; i<array1.length; i++) {
			System.out.print("Enter " + (i+1) + "-element of array1:");
			array1[i] = scan.nextInt();
		}
		
		System.out.print("Enter size of array2:");
		int size2 = scan.nextInt();
		while(size2<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again:");
			size2 = scan.nextInt();
		}
		int[] array2 = new int[size2];
		for(int i=0; i<array2.length; i++) {
			System.out.print("Enter " + (i+1) + "-element of array2:");
			array2[i] = scan.nextInt();
		}
		
		System.out.println("Output array3:" + Arrays.toString(containAllElements(array1, array2)));

	}
	
	public static int[] containAllElements(int[] arr1, int[] arr2) {
		
		int[] arr3 = new int[arr1.length+arr2.length];
		
		for(int i= 0; i<arr1.length; i++) {			
			arr3[i]=arr1[i];			
		}
		
		for(int i= arr1.length; i<arr3.length; i++) {			
			arr3[i]=arr2[i-arr1.length];
		}
		
		return arr3;
		
	}

}
