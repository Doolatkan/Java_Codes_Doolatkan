package day28_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question15 {

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
		
		System.out.println("Input array:" + Arrays.toString(array1));
		System.out.println("Output array:" + Arrays.toString(swapFirstLast(array1)));

	}
	
	public static int[] swapFirstLast(int[] arr) {
		
		//1-way
		int num = arr[0];		
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=num;
		
		//2-way
//		arr[0]=arr[0]+arr[arr.length-1];
//		arr[arr.length-1]=arr[0]-arr[arr.length-1];
//		arr[0]=arr[0]-arr[arr.length-1];
		
		return arr;
	}

}
