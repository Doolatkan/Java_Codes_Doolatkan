package day28_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter size of array:");
	    int size = scan.nextInt();
	    while(size<1) {
		     System.out.print("Array size cannot be 0 or negative number. Try it again:");
		     size = scan.nextInt();
	    }
	
	    int[] array1 = new int[size];
	    int[] array2 = {};
	
	    for(int i=0; i<array1.length; i++) {
		    System.out.print("Enter " + (i+1) + "-element:");
		    array1[i] = scan.nextInt();
	    }
	    
	    if(array1.length<2) {
	    	System.out.println("Input array1:" + Arrays.toString(array1));
			System.out.println("array1 is not valid array");
		}else {
			System.out.println("Input array1:" + Arrays.toString(array1));
		    System.out.println("Input array2:" + Arrays.toString(array2));
	        System.out.println("Output array2:" + Arrays.toString(containFirstLast(array1, array2)));
		}

	}
	
	public static int[] containFirstLast(int[] arr1, int[] arr2) {		
        arr2 = new int[2];
		arr2[0]=arr1[0];
		arr2[1]=arr1[arr1.length-1];
		
		return arr2;
		
	}

}
