package day48_collection_part3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day46_collection_part1.Product;

public class LoopMap {

	public static void main(String[] args) {
		
		Map<String, String> dataMap = new HashMap<>();
		
		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("uername", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckDriver", "Bob");
		dataMap.put("storeManager", "John");
		
		//keySet -> returns all the keys in the map
		//values _> return all the values in the map
		
		System.out.println("++++++++++++++++KEYS++++++++++++");
		
		for(String key : dataMap.keySet()) {
			System.out.print(key + " | ");
		}
		
		System.out.println();
		System.out.println("++++++++++++++++Values++++++++++++");
		
		for(String value : dataMap.values()) {
			System.out.print(value + " | ");
		}
		
		
		System.out.println();
		System.out.println("++++++++++++++++Key/Values++++++++++++");
		for(String key : dataMap.keySet()) {
			System.out.println(key + " = " + dataMap.get(key));
		}
		
		//looping by using for each ethod
		System.out.println("++++++++++++++++Key/Values++++++++++++");
		dataMap.forEach((k,v) -> System.out.println(k + " = " + v));
		
		//different combinations
		
		Map<Integer, Product> studentMap = new HashMap<>();
		
		Map<String, String[]> data = new HashMap<>();
		
		Map<Integer, List<String>> datList = new HashMap<>();
		
		Map<Integer, List<String[]>> data3 = new HashMap<>();
		
		Map<String, Map<Integer, Integer>> data4 = new HashMap<>();
		
		Map<String, Map<Integer, Product>> data5 = new HashMap<>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
