package review_session.week9;

import java.util.ArrayList;
import java.util.List;

public class AccountTest {

	public static void main(String[] args) {
		
		//Array of objects
		//Unlike a traditional array that store values like string, integer, boolean, etc
		//array objects stores Objects. The array elements store the location of the reference variables of the object
		
		 Account object[] = new Account[2];
		 object[0] = new Account();
		 object[1] = new Account();
		 
		 object[0].setData(1, 2);
		 object[1].setData(4, 5);
		 
		 System.out.println("For Array Element 0");
		 object[0].showData();
		 
		 System.out.println("For Array Element 1");
		 object[1].showData();
		 
		 System.out.println("====================================================================");
		 
		List<Account> listObject = new ArrayList<>();
		
		//I want to create a list
		//what kind of objects u want this list to hold it? -> object belongs to Account class
		
		listObject.add(new Account());
		listObject.add(new Account());
		listObject.add(new Account());
		listObject.add(new Account());
		
		listObject.get(0).setData(5, 25);
		listObject.get(1).setData(5, 25);
		listObject.get(2).setData(12, 0);
		System.out.println("For Array Element 0");
		listObject.get(0).showData();
		System.out.println("For Array Element 1");
		listObject.get(1).showData();
		System.out.println("For Array Element 2");
		listObject.get(2).showData();
		System.out.println("For Array Element 3");
		listObject.get(3);
		listObject.get(3).showData();
		
		System.out.println(listObject.size());
		System.out.println(listObject.get(1).toString());

	}

}
