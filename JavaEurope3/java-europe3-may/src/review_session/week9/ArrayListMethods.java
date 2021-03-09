package review_session.week9;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("McLean");
		cities.add("Alexandria");
		cities.add("Fairfax");
		cities.add("Falls Church");
		cities.add("Baltimore");
		cities.add("Berlin");
		cities.add("Amsterdam");
		
		cities.add(0, "Istanbul");
		cities.add(1, "Restong");
		
		System.out.println(cities);
		
		cities.add(2, "Ankara");
		System.out.println(cities);
		
		cities.set(4, "New Yourk");
		cities.set(5, "Chicago");
		System.out.println(cities);
		
		cities.remove(3);
		cities.remove("Ankara");
		System.out.println(cities);
		

	}

}
