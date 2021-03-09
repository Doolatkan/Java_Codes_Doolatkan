package day29_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question30 {

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
		
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		
		System.out.println(Arrays.toString(aloneElement(array, num)));
	}
	
	public static int[] aloneElement(int[] arr, int num) {
		
		for(int i=1; i<arr.length-1; i++) {
		
				if(arr[i]==num && (arr[i]!=arr[i-1]) && (arr[i]!=arr[i+1])) {
					if(arr[i-1] >= arr[i+1]) {
				   	    arr[i]=arr[i-1];
				    }else {
					    arr[i]=arr[i+1];
				    }
			    }
	        }
		
		return arr;		
	}

}
