package homeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Glosary {

	public static void main(String[] args) {
		
		ArrayList<String> items = new ArrayList<>();
		
		Options.printOption();
		
		Scanner scan = new Scanner(System.in);
		int numOption=0;
		String item = "";
		int itemNum=0;
		int index = 0;
		do {
		System.out.print("Enter your choice: ");
		numOption = scan.nextInt();
		
		
		if(numOption==0) {
			Options.printOption();
		}else if(numOption == 1) {
			System.out.println("You have " + items.size() + " items in your grocery list");
			
				for(int i=0; i<items.size();i++) {
					System.out.println((i+1)+ ". " + items.get(i));
				}
			
		}else if(numOption==2) {
			System.out.println("Please enter the grocery item:");
			item = scan.next();	
			//scan.nextLine();
			items.add(item);
		}else if(numOption==3) {
			System.out.print("Enter item number: ");
			itemNum = scan.nextInt();
			System.out.print("Enter replacement item: ");
			item = scan.next();
			//scan.nextLine();
			if(itemNum>items.size()) {
				System.out.println("You don't have item with this number");
			}else {
				items.set((itemNum-1), item);
				System.out.println("Grocery item " + itemNum + " has been modified");
			}
		}else if(numOption == 4) {
				System.out.print("Enter item number: ");
				itemNum = scan.nextInt();
				if(itemNum>items.size()) {
					System.out.println("You don't have item with this number");
				}else {
					items.remove((itemNum-1));
					System.out.println("Grocery item " + itemNum + " has been deleted");
				}
		}else if(numOption==5){
			System.out.println("Item to search for:");
			item = scan.next();
			//scan.nextLine();
					
			for(int i=0; i<items.size();i++) {
				if(item.equalsIgnoreCase(items.get(i))) {					
					index++;
					break;
				}
			}
			if(index>0) {
				System.out.println("Found " + item + " in our grocery list");
				
			}else {
				System.out.println(item + " didn't found in your bag");
			}			
				
		}		
		
		}while(numOption!=6);	     

	}

}
