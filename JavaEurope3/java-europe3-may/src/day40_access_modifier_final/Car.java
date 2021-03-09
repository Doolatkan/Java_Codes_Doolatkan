package day40_access_modifier_final;

public class Car extends Object{
	
	String model;
	public int year;
	private int door;
	protected double engine;
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", door=" + door + ", engine=" + engine + "]";
	}
	
	
	

}
