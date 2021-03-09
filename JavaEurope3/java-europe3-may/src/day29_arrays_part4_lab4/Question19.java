package day29_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question19 {

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
		
		System.out.print("Sum of numbers except starting 6 to the next 7:" + Arrays.toString(array));
		System.out.println(" = " + (sumExcept6nex7(array)));	

	}
	
	public static int sumExcept6nex7(int[] arr) {
		boolean check = false;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(check == false) {
				if(arr[i]!=6) {
					sum = sum + arr[i];
				}else {
					check=true;
				}			
			}else {
				if(arr[i]==7) {
				   check = false;
				}
			}
		}	
				
		return sum;
	}
}


