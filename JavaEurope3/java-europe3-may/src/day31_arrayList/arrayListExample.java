package day31_arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		
		//Languages 
		//Print size arrayList
		//read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("English");
		languages.add("German");
		languages.add("Java");
		languages.add("Spanish");
		languages.add("Kyrgyz");
		languages.add("Czech");
		languages.add("Russian");
		
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString());
		
		System.out.println(languages.get(2));
		System.out.println(languages.get(5));
		
		languages.add("Java");
		System.out.println(languages.toString());
		
		languages.remove(3);
		
		System.out.println(languages.toString());
		System.out.println("Number of values: " + languages.size());
		
		
		languages.add("France");
		System.out.println("Number of values: " + languages.size());
		
		

	}

}
