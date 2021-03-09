package review_session.week9;

import java.util.*;

public class MethodsReturnArrayList {

	public static void main(String[] args) {
		
		
	    System.out.println(getIntList(20));
	    System.out.println(getRandomIntList(52));
	    System.out.println(getRandomIntList(5));

	}
	
	
	public static List<Integer> getIntList(int size){
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=1; i<=size; i++) {
			numbers.add(i);
		}
		
		return numbers;
	}
	
	public static List<Integer> getRandomIntList(int size){
		
		Random rn = new Random();
		
		List<Integer> nums = new ArrayList<>();
		
		for(int i=0; i<size; i++) {
		     nums.add(rn.nextInt(101));
		}
		
		return nums;
	}

}
