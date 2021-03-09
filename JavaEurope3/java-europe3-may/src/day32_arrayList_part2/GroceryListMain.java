package day32_arrayList_part2;

import java.util.*;

public class GroceryListMain {
	
	static GrosceryList groceryList = new GrosceryList();		

    static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		printInstructions();
		
		int choice=0;
		
		while(choice!=6) {
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice){
				case 0:
					printInstructions();
				    break;
				case 1:
					groceryList.printingGroceryList();
				    break;
				case 2:
					addItem();
				    break;
				case 3:
					modifyItem();					
				    break;
				case 4:
					removeItem();					
				    break;
				case 5:
					searchItem();
				    break;
				case 6:
				    break;
				default:
					System.out.println("Invalid number. Try it again.");
				    break; 		
			}
			
		}
        

	}
	
	public static void printInstructions() {
		
		
		    System.out.println("\nPress");
	        System.out.println("\t0 - To print choice options.");
	        System.out.println("\t1 - To print the list of grocery items.");
	        System.out.println("\t2 - To add an item to the list.");
	        System.out.println("\t3 - To modify an item in the list.");
	        System.out.println("\t4 - To remove an item from the list.");
	        System.out.println("\t5 - To search an item from the list.");
	        System.out.println("\t6 - To quit the application.");
	}
	
	
	public static void addItem() {
		
		System.out.println("Enter your grocery item: ");
		groceryList.addGroceryItem(scan.nextLine());
	}
	
	public static void modifyItem() {
		
		System.out.print("Enter item number: ");
		int itemNum = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = scan.nextLine();
		
		groceryList.modifyGroceryItem(itemNum-1, newItem);
		
	}
	
	public static void removeItem() {
		
		System.out.print("Enter item number: ");
		int itemNum = scan.nextInt();
		scan.nextLine();
		groceryList.removeGroceryItem(itemNum-1);		
		
	}
	
	public static void searchItem() {
		
		System.out.print("Item to search for: ");
		String searchItem = scan.nextLine();
		
		if(groceryList.findItem(searchItem) != null) {
			System.out.println("Fount \"" + searchItem + "\" in your glocery list");
		}else {
			System.out.println(searchItem + " is not in the glocery list");
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
