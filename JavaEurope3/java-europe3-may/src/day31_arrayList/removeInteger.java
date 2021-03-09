package day31_arrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		
		System.out.println(nums);
		
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		System.out.println(nums.iterator());
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		System.out.println("Number of value: " + nums.size());
		System.out.println(nums.toString());
		
		
		nums.remove(5);// remove specified index number from the list
		System.out.println(nums.toString());
		
		nums.remove(Integer.valueOf(5));// remove specified element from the list
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(4);// remove specified element from the list
		
		nums.remove(n1);
		System.out.println(nums.toString());
		
		nums.add(10);
		System.out.println(nums.toString());
		
		nums.remove(Integer.valueOf(10));
		System.out.println(nums.toString());
		
		nums.set(3, 60);
		System.out.println(nums.toString());
		
		
		

	}

}
