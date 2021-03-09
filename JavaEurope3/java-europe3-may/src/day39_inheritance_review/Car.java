package day39_inheritance_review;



public class Car extends Vehicle{
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	
	public Car(String name, int size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}	
	
	
	public void change(int currentGear) {
		this.currentGear = currentGear;
	}
	
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity():Velocity " + speed + " direction " + direction);
		super.move(speed, direction);
	}
	
	
	@Override
	void move(int velocity, int direction) {
		
		setCurrentDriection(velocity+10);
		setCurrentDriection(direction+10);
		System.out.println("Vehicle.move():Moving at " + getCurrentVelocity() + " in direction "  + getCurrentDriection());
	  		
	}


	static{
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is instance block");
	}	

}
