package bootcamp_day2.ShapesTask;

public class Cube extends Shape implements HasVolume {
	
	public double side;
	public double volume;
	
	@Override
	public double calculateVolume() {
		
		return side*side*side;
	}

	public Cube(double side) {
		super("Cube");
		this.side = side;
		area = calculateArea();
		perimeter = calculatePerimeter();
		volume = calculateVolume();
	}

	@Override
	public double calculateArea() {
		
		return side*side*6;
	}

	@Override
	public double calculatePerimeter() {
		
		return side*4*6;
	}
	
	
	

}
