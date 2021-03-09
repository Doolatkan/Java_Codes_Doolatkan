package day7_controlFlowStatements;

public class task28 {

	public static void main(String[] args) {


		
		int quantity = 100;
		double price = 1500;
		double revenue = price*quantity;
		double discount = 0;
		
		
		if(revenue>5000) {
			
			discount = revenue * 0.1;
			revenue= revenue-discount;
			
			
		}
		System.out.println("Discount is: " + discount);
		System.out.println("Revenue is: " + revenue);
		

	}

}
