package day24_arrays_part1;

public class Task92 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int multiply = 0;
		for(int i=0; i<numbers.length; i++) {
			multiply = numbers[i]*19;
			System.out.println(multiply);
		}
	}

}
