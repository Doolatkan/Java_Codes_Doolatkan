package day43_polimorphizm;

public class ShapesArray {

	public static void main(String[] args) {
		
        int[]numbers = new int[3];		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		
		Shape[] shapes= new Shape[3];
		
		shapes[0] = new Square();
		shapes[1] = new Triangle();
		shapes[2] = new Circle();
		
		//left side parent/interface
		//right side child
		
	    for(Shape sh : shapes) {
	    	//System.out.println(sh.getClass().getName());
	    	System.out.println(sh.getClass().getSimpleName());
	    	//sh.draw();
	    }
		
		
		

	}

}
