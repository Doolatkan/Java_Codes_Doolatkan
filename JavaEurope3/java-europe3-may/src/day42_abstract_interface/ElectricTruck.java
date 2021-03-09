package day42_abstract_interface;

public abstract class ElectricTruck extends ElectricCar {
	
	abstract void load(String item);

	public ElectricTruck(String model, double price, String color) {
		super(model, price, color);
		
	}
	
	

}
