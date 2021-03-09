package day29_arrays_part4_lab4;

import java.util.Scanner;

public class Question26 {

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
		
		if(array.length<3) {
			System.out.println("Array is not valid array.");
		}else {
		System.out.println(contains3Even3Odd(array));
		}
	}
	
	public static boolean contains3Even3Odd(int[] arr) {
		
		for(int i=0; i<arr.length-2; i++) {
			
			if((arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0)||(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)) {
				return true;
			}
		}
		return false;
	}

}
