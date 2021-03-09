package day29_arrays_part4_lab4;

import java.util.Scanner;

public class Question21 {

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
		
		if(array.length<4) {
			System.out.println("Array is not valid.");
		}else {
			System.out.println(sumAll2Exactly8(array));
		}
	}
	
	public static boolean sumAll2Exactly8(int[] arr) {
		
		int sum = 0;
		
		for(int val : arr) {
			if(val==2) {
				sum = sum + val;
			}
		}
		
		if(sum==8) {
			return true;
		}
		
		return false;
					
	}

}
