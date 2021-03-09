package day48_collection_part3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import day46_collection_part1.Product;


public class HashSetOfProducts {

	public static void main(String[] args) {
		
		//Set<Product> productSet = new HashSet<>();
		Set<Product> productSet = new TreeSet<>();
		productSet.add(new Product("spoon", 12.3));
		productSet.add(new Product("table", 20.3));
		productSet.add(new Product("chair", 15.6));
		productSet.add(new Product("book", 20.20));
		productSet.add(new Product("book", 19.99));
		
		System.out.println(productSet.toString());
		
		for(Product pro : productSet) {
			System.out.println(pro.getPrice());
			
		}
		
		productSet.forEach(p -> System.out.print(p.getPrice()+"|"));
		
		
		

	}

}
