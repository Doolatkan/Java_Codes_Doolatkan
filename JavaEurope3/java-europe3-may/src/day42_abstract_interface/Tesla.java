package day42_abstract_interface;

public class Tesla extends ElectricCar{
	
	

	public Tesla(String model, double price, String color) {
		super(model, price, color);		
	}

	@Override
	void start() {
		System.out.println("Tesla is strating...");
		System.out.println("Change to drive mode.");		
	}

	@Override
	void charge() {
		System.out.println("Tesla charging - plugin to electric outlet...");		
	}

	@Override
	void drive() {
	    System.out.println("Tesla is driving");			
	}


	

}
