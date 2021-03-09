package day27_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = scan.nextInt();		
		while(size==0) {
			System.out.print("Number of size cannot be 0 or negative. Try it again:");
			size = scan.nextInt();
		}
		
		int[] numbers = new int[size];
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print("Enter " + (i+1) + "-element:");
			numbers[i] = scan.nextInt();
		}
		
		System.out.println(sameFirstLast(numbers));
		
	}
	
	public static String sameFirstLast(int[] num) {
		
		if(!(num.length > 1)) {
			return "not a valid array";
		}
		if(num[0] == num[num.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
	}
	
}
