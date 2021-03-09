package review_session.week9;

import java.util.*;


public class ArraysAsList {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,40,12,3,5,7));

		System.out.println(nums);
		
		nums.remove(0);
		nums.add(2);
		System.out.println(nums);
		
		List<Integer> num2 = new ArrayList<>(Arrays.asList(10,20,30));
		System.out.println(num2);
	}

}
