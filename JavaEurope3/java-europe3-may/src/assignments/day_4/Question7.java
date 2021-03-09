package assignments.day_4;

public class Question7 {

	public static void main(String[] args) {
		
		
		int quarters, dimes, nickles, change;
		 quarters = 0;
		 dimes = 0;
		 nickles = 0;
		 change =0;
		 		
		 
		int price = 50;
		
		if (price >= 25 && price <= 100) {
		
		    change = 100-price;
		    quarters = change/25;
		    change = change%25;
		    dimes = change/10;		        	  
			nickles=(change%10)/5;
			
	     System.out.println("Price in cents: " + price + "\nYour change is: " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles");
		
	     }else {
		
		    System.out.println("An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100");
		 }
	}
}



