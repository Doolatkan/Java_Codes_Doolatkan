package day25_arrays_part2;

import java.util.Arrays;

public class Task92_ArrayMultipleElements {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]*19);
			
		}
		
		
		System.out.print("int[] numbers = {");
		for(int i=0; i<numbers.length; i++) {
			if(i<numbers.length-1) {
			System.out.print(numbers[i] + ",");
			}else {
				System.out.print(numbers[i]);
			}
		}
		System.out.println("};");
		
		
		
		System.out.println(Arrays.toString(numbers));	
		

	}

}
