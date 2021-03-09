package day27_arrays_part4_lab4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of 1-array:");
		int size1 = scan.nextInt();
		while(size1<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again:");
			size1 = scan.nextInt();
		}
		
		int[]array1 = new int[size1];
		for(int i=0; i<array1.length;i++){
			System.out.print("Enter " + (i+1) + "-element:");
			 array1[i] = scan.nextInt();
		}
		
		System.out.print("Enter size of 2-array:");
		int size2 = scan.nextInt();
		while(size2<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again:");
			size2 = scan.nextInt();
		}
		
		int[]array2 = new int[size2];
		for(int i=0; i<array2.length;i++){
			System.out.print("Enter " + (i+1) + "-element:");
			 array2[i] = scan.nextInt();
		}
		
		System.out.println(sameFirstsLasts(array1,array2));

	}
	
	public static String sameFirstsLasts(int[] arr1, int[] arr2) {
		
		if(!(arr1.length>1)&& arr2.length>1) {
			return "array1 is not valid array";
		}else if(arr1.length>1&& !(arr2.length>1)) {
			return "array2 is not valid array";
		}else if(!(arr1.length>1 && arr2.length>1)) {
			return "both arrays are not valid array";
		}
		
		if(arr1[0]==arr2[0] || arr1[arr1.length-1]==arr2[arr2.length-1]) {
			return "true";
		}else {
			return "false";
		}
	}

}
