package day31_arrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		
		ArrayList<String>cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		//Print each city by using for-each loop and by using for iterator loop, separated by space
		System.out.println("-------------------------------------------");
		for(int i=0; i<cities.size(); i++) {
			System.out.println(cities.get(i));
		}
	
		System.out.println("\n-------------------------------------------");
		for(String city : cities) {
			System.out.println(city);
		}
		
		
		System.out.println("\n-------------------------------------------");
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");
		System.out.println(cities.toString());
		
		System.out.println("\n-------------------------------------------");
		
		cities.add(1, "Istanbul");
		cities.add(0, "Arlington");
		cities.add(2, "Rome");
		System.out.println(cities.toString());
		
		cities.add(2, "Ankara");
		System.out.println(cities.toString());
		
		System.out.println("\n-------------------------------------------");
		
		int idx = cities.indexOf("Istanbul");
		System.out.println(idx);
		
		System.out.println(cities.indexOf("Bursa"));
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(cities.toString());
		System.out.println(empty);
		
		//cities.remove(2); //java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 0
		System.out.println(cities.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
