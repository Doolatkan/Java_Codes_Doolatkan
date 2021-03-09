package day38_Inheritance_part2;

public class Car extends Vehicle{

	int maxSpeed = 180;
	
	public void display() {
		System.out.println("Maximum speed: " + super.maxspeed);
		System.out.println("Maximum speed: " + maxSpeed);
	}
}
