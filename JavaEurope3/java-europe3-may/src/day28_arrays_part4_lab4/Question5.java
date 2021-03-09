package day28_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

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
	    System.out.println("Input array:" + Arrays.toString(array));
	    System.out.println("Output array:" + Arrays.toString(rotatedLeft(array)));
	
	}
	
	public static int[] rotatedLeft(int[] arr) {
		
		int num=arr[0];
		
		for(int i=0; i<arr.length-1; i++) {	
			
			arr[i]=arr[i+1];			
		}
		
		arr[arr.length-1]=num;
		
		return arr;		
	}
}
