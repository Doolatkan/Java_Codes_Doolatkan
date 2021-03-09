package day26_arrays_part3;

import java.util.*;

public class MethodArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size:");
		int size = scan.nextInt();
		
		while(size<0) {
			System.out.print("Array size can not be minus number. Try it again:");
			size = scan.nextInt();
		}
		
		printArray(size);
				
	}
	
	public static int[] createArray(int arraySize) {
		
		Random rn = new Random();
		
		int[] myArray = new int[arraySize];
		
		for(int i=0; i<myArray.length; i++) {
			
			myArray[i] = rn.nextInt(100);
		}
		
		return myArray;
		
	}
	
	public static void printArray(int number) {
		
		for(int value : createArray(number)) {
			System.out.print(value+" ");
		}
	}

}
