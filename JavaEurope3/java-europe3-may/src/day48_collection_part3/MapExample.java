package day48_collection_part3;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Double> items = new HashMap<>();
		items.put("Apple", 3.49);
		items.put("Flowers", 5.59);
		items.put("Eggs", 4.49);
		items.put("Milk", 6.2);
		items.put("Cherries", 3.79);
		items.put("Apple", 5.49);
		
		System.out.println(items.size());
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());
		
		System.out.println(items.get("Apple"));
		System.out.println(items.get("Milk"));
		System.out.println(items.remove("Flowers"));
		System.out.println(items.toString());
		
		System.out.println("Is Apple there? " + items.containsKey("Apple"));
		System.out.println("Is Flowers there? " + items.containsKey("Flowers"));
		
		items.replace("Eggs",3.5);
		System.out.println("Price of eggs " + items.get("Eggs"));
		
		double price = items.get("Cherries");
		System.out.println(items.replace("Cherries", price*2));
		items.replace("Cherries", items.get("Cherries")+2);
		System.out.println(items.get("Cherries"));
		
		

	}

}
