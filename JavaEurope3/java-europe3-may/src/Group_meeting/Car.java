package Group_meeting;

public class Car {
	
	String model;
	static int year;
	
	
	public void printCar(){
		System.out.println("Car model = " + model);
		System.out.println("Car year = " + year);
	}
	
	
	public static void printCar1() {
		System.out.println("Car year = " + year);
	}
	
	static {
		System.out.println("Welcome to car company");
	}
	
	

}
