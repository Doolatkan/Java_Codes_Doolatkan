package day25_arrays_part2;

import java.util.Arrays;


public class ReturnArray {

	public static void main(String[] args) {
		
		double[] values;
		
		values = getArray();
		
		System.out.println(values);
		
		for(double num : values) {
			System.out.print(num + " ");
		}
		
	

	}
	
	public static double[] getArray() {
		
		double[] array = {1.2,2.3,4.4,5.6};
		
		return array;
		
	}
	
	

}
