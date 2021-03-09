package day28_arrays_part4_lab4;

import java.util.Scanner;

public class Question8 {

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
		
		System.out.println(contains2or3(array));

	}
	
	public static boolean contains2or3(int[] arr) {
		
		for(int val : arr) {
			if(val==2 || val==3) {
				return true;
			}
		}
		
		return false;		
	}

}
