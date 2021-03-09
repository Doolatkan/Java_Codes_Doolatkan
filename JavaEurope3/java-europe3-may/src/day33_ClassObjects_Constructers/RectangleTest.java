package day33_ClassObjects_Constructers;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectable r1 = new Rectable();//I not create default constructor
		
		
		
		
		
		Rectable r2 = new Rectable();
		r2.length = 3.5;
		r2.width = 2.7;
		
		System.out.println(r1.length); // who is giving me 
		System.out.println(r2.width);
		
		

	}

}
