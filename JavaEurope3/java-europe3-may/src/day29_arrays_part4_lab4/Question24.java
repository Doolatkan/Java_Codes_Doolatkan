package day29_arrays_part4_lab4;

import java.util.Scanner;

public class Question24 {

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
		
		System.out.print("Enter a number which you looking:");
		int lookingNumber = scan.nextInt();
		
		System.out.println(isNumberEverywhere(array, lookingNumber));

	}
	
	public static boolean isNumberEverywhere(int[] arr, int number) {
		
		boolean flag = false;
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]==number) {
				if (arr[i+1]==number || arr[i+2]==number) {
			
					return true;
				}
			}
		}
		
		return false;		
	
	}	
	
	
	
	
	

}
