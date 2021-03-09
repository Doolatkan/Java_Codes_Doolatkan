package day31_arrayList;

import java.util.ArrayList;

public class addAll {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		
		l1.add("Java");
		l1.add("JavaScript");
		
		ArrayList<String> l2 = new ArrayList<>();
		
		l2.add("C#");
		l2.add("C++");
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		System.out.println("-------------------------------------");
		l2.addAll(l1);
		System.out.println(l2.toString());
		System.out.println(l1.toString());
		
		System.out.println("-------------------------------------");
		l1.addAll(l2);
		System.out.println(l1);
		
		String[] numbers = {"Apples", "Orange"};
		//l2.addAll(numbers);//error

	}

}
