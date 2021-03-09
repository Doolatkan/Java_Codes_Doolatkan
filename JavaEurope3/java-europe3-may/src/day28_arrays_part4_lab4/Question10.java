package day28_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = scan.nextInt();
		while(size<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again");
			size = scan.nextInt();
		}
		
		int[] array = new int[size];
		for(int i=0; i<array.length; i++) {
			System.out.print("Enter " + (i+1) + "-element of array:");
			array[i] = scan.nextInt();
		}
		if(array.length<2) {
			System.out.println("Aray " + Arrays.toString(array) + " is not valid array:");
		}else {
			System.out.println(contains2twice3twice(array));
		}

	}
	
	public static boolean contains2twice3twice(int[] arr) {
		
		int twice2 = 0;
		int twice3 = 0;
		
		for(int val : arr) {
			if(val==2) {
				twice2++;
			}else if(val==3) {
				twice3++;
			}
		}
		
		if(twice2==2 || twice3==3) {
			return true;
		}
		
		return false;
	}

}
