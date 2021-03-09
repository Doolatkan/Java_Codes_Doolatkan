package bootcamp_day2.ShapesTask;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismPractice {
	
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>();
		list.addAll(Arrays.asList(
				new Circle(5),
				new Rectangle(10, 5),
				new Square(5),
				new Cube(7)
				));
		
		//Circle circle = new Shape();
		
		Shape circle = new Circle(5); //upcasting: converting smaller type to larger, implicitly done
		
		Square square = new Square(4);
		Shape shape2 =square; //upcasting: converting smaller type to larger, implicitly done
		
		Shape shape3 = new Cube(4);
		Cube cube = (Cube)shape3; //down cast: converting larger reference typr to smaller
		
		cube.calculateVolume();
		
		/*
		 * WebDriver driver = new ChromeDriver();
		 TakeScreenShot ts = (TakeScreenShot) driver;
		 */
		
		Shape shape4 = new Circle(40);
		//Square square23 = (Square) shape4;  //there MUST be IS A relationship between objects in order to casting (we will get Class Cast Exception)
		
		
	}

}
