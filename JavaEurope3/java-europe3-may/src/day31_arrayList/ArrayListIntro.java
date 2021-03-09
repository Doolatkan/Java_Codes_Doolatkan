package day31_arrayList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		//Creating an ArrayList
		
		ArrayList<String> names = new ArrayList<>();
		System.out.println(names.size());
		System.out.println(names);
				
		ArrayList<Integer> nums = new ArrayList<>();
		
		//Assigning values to ArrayList
		
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(100);
		nums.add(98);
		nums.add(656);
		nums.add(Integer.valueOf("100"));
		nums.add(new Integer("105"));
		nums.add(new Integer(110));
		
		//Reading from ArrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(names.size()-1));
		System.out.println(names.indexOf("Smith"));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
		System.out.println(names.toString());
		
		ArrayList<String> n = names;
		System.out.println(n.toString());
		System.out.println(n.equals(names));
		System.out.println(n==names);
		System.out.println(names.equals(n));
		System.out.println(names.subList(2, 4));
		
		System.out.println(names.iterator());
		
		System.out.println(n);
		System.out.println(names);
		n.add("Di");
		System.out.println(n);
		System.out.println(names);
		

	}

}
