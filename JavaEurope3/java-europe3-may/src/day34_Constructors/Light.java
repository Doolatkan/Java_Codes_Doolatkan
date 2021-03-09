package day34_Constructors;

public class Light {
	
	int numOfWatts;
	boolean indicator;
	String location;
	
	
	
	public Light() {
		this(0,false,"y");
		
		System.out.println("Returning from no-argument constructor no.1");
	}
	
	public Light(int watt, boolean ind) {
		
		this.numOfWatts=watt;
		this.indicator=ind;
		System.out.println(numOfWatts+" " + indicator);
		System.out.println("Returning from constructor no.2");
		
	}

	public Light(int numOfWatts, boolean indicator, String location) {
		this(10, true);
		this.numOfWatts = numOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println(numOfWatts + " " + indicator + " " + location);
		
		System.out.println("Returning from constructor no.3");
	}
	
	
	

}
