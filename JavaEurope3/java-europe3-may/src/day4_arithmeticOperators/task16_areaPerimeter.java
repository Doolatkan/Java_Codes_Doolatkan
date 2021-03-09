package day4_arithmeticOperators;

public class task16_areaPerimeter {

	public static void main(String[] args) {


		double area, perimeter, radius;
		final double PI = 3.14;
		radius = 10;
		
		perimeter = 2*radius*PI;
		area = radius * radius * PI;
		
		
		System.out.println("Area of the circle is " + area);
		System.out.println("Perimeter of the circle is " + perimeter);
		

	}

}
