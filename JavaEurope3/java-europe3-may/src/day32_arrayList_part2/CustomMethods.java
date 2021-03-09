package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10); 
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		System.out.println(printList(numsList));
		
		ArrayList<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);		
		
		double sum = sumList(doubleList);
		System.out.println("Sum of doubleList = " + Math.round(sum*100.0)/100.0);
		
		ArrayList<Integer> list = getList(25);
		System.out.println(list.toString());
		
		ArrayList<Integer> rList = getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("12");
		
		ArrayList<Integer> converted = convertTo(strNums);
		System.out.println(converted);
	}
	
	public static ArrayList<Integer> printList(ArrayList<Integer> nums){
		
		for(Integer val : nums) {
			
			System.out.print(val+" ");
		}
		
		System.out.println();
		
		return nums;
	}
	
	public static double sumList(ArrayList<Double> doubleList) {
		
		double sum = 0;
		
		for(Double val : doubleList) {
			
			sum += val;
		}
		
		return sum;
	}

	
	public static ArrayList<Integer> getList(int size){		
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i=1; i<=size; i++) {
			
			newList.add(i);
		}
		
		return newList;
		
	}
	
	public static ArrayList<Integer> getRandomList(int size){
		
		Random rn = new Random();
		
		ArrayList<Integer> newRList = new ArrayList<>();
		
		for(int i=0; i<size; i++) {
			
			newRList.add(rn.nextInt(101));
		}
		
		return newRList;
	}
	
	public static ArrayList<Integer> convertTo(ArrayList<String> strN){
		
		ArrayList<Integer> convertedList = new ArrayList<>();
		
		for(String val : strN) {
			
			convertedList.add(Integer.parseInt(val));
			//convertedList.add(Integer.valueOf(val));
		}
		
		return convertedList; 
		
	}


}
