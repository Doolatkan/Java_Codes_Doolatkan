package day29_arrays_part4_lab4;

import java.util.Scanner;

public class Question22 {

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
		
		System.out.println(num1GreaterThanNum4(array));

	}
	
	public static boolean num1GreaterThanNum4(int[] array) {
		
		int count1 = 0;
		int count4 = 0;
		
		for(int val : array) {
			if(val==1) {
				count1++;
			}else if(val==4) {
				count4++;
			}
		}
		
		if(count1>count4) {
			return true;
		}
		
		return false;		
		
	}

}
