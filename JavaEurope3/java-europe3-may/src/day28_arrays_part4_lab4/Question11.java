package day28_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question11 {

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
			System.out.print("enter " + (i+1) + "-element of array:");
			array[i] = scan.nextInt();
		}
		
		if(array.length<2) {
			System.out.println("Array " + Arrays.toString(array) + " is not valid array.");
		}else {
			System.out.println("Input array:" + Arrays.toString(array));
			System.out.println("Output array:" + Arrays.toString(followed2by3(array)));
		}

	}
	
	public static int[] followed2by3(int[] arr) {		
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1] = 0;
			}
		}
		
		return arr;
		
	}

}
