package review_session.week6;

public class Product {
	
	String title;
	double price;
	int rating;
	String seller;
	
	
	public void displayInfo() {
		
		System.out.println("---------Product info----------");
		System.out.println("title = " + title);
		System.out.println("price = " + price);
		System.out.println("rating = " + rating);
		System.out.println("seller = " + seller);
	}

}
