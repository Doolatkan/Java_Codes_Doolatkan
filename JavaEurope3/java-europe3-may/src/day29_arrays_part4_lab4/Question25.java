package day29_arrays_part4_lab4;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of arrays:");
		int size = scan.nextInt();
		
		while(size<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again:");
			size = scan.nextInt();
		}
		
		int[] array1 = new int[size];
		for(int i=0; i<array1.length; i++) {
			System.out.print("Enter " + (i+1) + "-element of array1:");
			array1[i] = scan.nextInt();
		}
		
		int[] array2 = new int[size];
		for(int i=0; i<array2.length; i++) {
			System.out.print("Enter " + (i+1) + "-element of array2:");
			array2[i] = scan.nextInt();
		}
		
		System.out.println("output:" + differBy2Less(array1, array2));	

	}
	
	public static int differBy2Less(int[] arr1, int[] arr2) {
		int count = 0;
		for(int i=0; i<arr1.length; i++) {
			if((arr1[i]-arr2[i]>0 && arr1[i]-arr2[i]<=2) || (arr2[i]-arr1[i]>0 && arr2[i]-arr1[i]<=2)) {
				count++;
			}
		}
		return count;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
