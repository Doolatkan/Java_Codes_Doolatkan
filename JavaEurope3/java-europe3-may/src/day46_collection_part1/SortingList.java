package day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("kotlin");
		list.add("c++");
		list.add("python");
		
		System.out.println("Before sorting");
		System.out.println(list.toString());
		
		Collections.sort(list);
		System.out.println("After sorting");
		System.out.println(list.toString());
		
		Product p = new Product("table", 22);
		List<Product> products = new ArrayList<>();
		products.add(new Product("Acer", 1500));
		products.add(new Product("bag", 15.00));
		products.add(new Product("shoes", 150));
		products.add(new Product("spoon", 13.99));
		products.add(p);
		
		System.out.println("Before sorting by price");
		System.out.println(products.toString());
		
		Collections.sort(products);
		System.out.println("After sorting by price");
		System.out.println(products.toString());
		
		Product p1 = new Product("milk", 3);
		Product p2 = new Product("chair", 7.99);
		
		System.out.println(p1.compareTo(p2));
		
	}

}
