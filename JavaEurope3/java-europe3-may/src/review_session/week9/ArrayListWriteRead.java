package review_session.week9;

import java.util.ArrayList;

public class ArrayListWriteRead {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(10);
		nums.add(20);
		nums.add(21);
		nums.add(-7);
		
		System.out.println(nums.size());
		
		System.out.println(nums);
		
		System.out.println(nums.get(0));
		System.out.println(nums.get(2));
		
		for(int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		System.out.println("----------------------------");
		for(int val : nums) {
			System.out.println(val);
		}

	}

}
