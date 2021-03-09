package day31_arrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		//print number of items
		
		int count = shoppingList.size();
		System.out.println(count);
		
		System.out.println(shoppingList.toString());
		System.out.println("-------------------------------------");
		for(String items : shoppingList) {
			System.out.println(items);
		}
		System.out.println("-------------------------------------");
		System.out.println(shoppingList.get(0) + ", " + shoppingList.get(shoppingList.size()-1));
		
		
		System.out.println("-------------------------------------");
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		System.out.println("-------------------------------------");
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		System.out.println("-------------------------------------");
		for(int i=0; i<shoppingList.size(); i++) {
			System.out.println(shoppingList.get(i));
		}
		
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
