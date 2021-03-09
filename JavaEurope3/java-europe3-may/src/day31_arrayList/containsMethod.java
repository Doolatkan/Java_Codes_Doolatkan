package day31_arrayList;

import java.util.ArrayList;

public class containsMethod {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		list1.add("Jun");
		list1.add("Jul");
		list1.add("Aug");
		list1.add("Sep");
		list1.add("Oct");
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2 = list1;
		
		
		//copy all values from list1
		
		ArrayList<String> months = new ArrayList<>(list1);
		months.add("Nov");
		months.add("Dec");
		System.out.println(months);
		
		System.out.println(months.contains("Jan"));
		System.out.println(list1.contains("Dec"));
		
		//how to check if Feb is in second position
		System.out.println("------------------------------------------");
		System.out.println(months.get(1).contains("Feb"));
		System.out.println(months.indexOf("Feb")==1);
		System.out.println(months.get(1).equals("Feb"));
		System.out.println(months.subList(1,2));
		System.out.println("------------------------------------------");
		
		list1.add("Jan");
		System.out.println("List1: " + list1);
		System.out.println("Months: " + months);
		
		System.out.println("------------------------------------------");
		if(months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some value are missing");
		}
		
	System.out.println("------------------------------------------");
		
		list1.add("XXX");
		System.out.println("List1: " + list1);
		System.out.println("Months: " + months);
		
		System.out.println("------------------------------------------");
		if(months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some value are missing");
		}
	    

	}

}
