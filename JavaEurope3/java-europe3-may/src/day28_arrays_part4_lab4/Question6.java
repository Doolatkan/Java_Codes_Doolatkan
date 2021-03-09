package day28_arrays_part4_lab4;

import java.util.*;


public class Question6 {

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
	    System.out.println("Output array:" + Arrays.toString(greatestElement(array)));

	}
	
	public static int[] greatestElement(int[] arr) {
		//1-way
		int greatest = 0;
		
		for(int val : arr) {
			if(greatest<val) {
				greatest = val;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=greatest;
		}
		
		//2-way
//       Arrays.sort(arr);
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=arr[arr.length-1];
//		}
		
		
		
		//3-way
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[0]<arr[i+1]) {//				
//				arr[0]=arr[i+1];
//			}
//		}
//		
//		for(int i=0; i<arr.length-1; i++) {
//			arr[i+1]=arr[0];
//		}
		
		
		return arr;
	}

}
