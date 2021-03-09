package day44_oopreview.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape diamond = new Diamond();		
		Shape square = new Square();
		Object shape = new Shape();
		
		square.draw();
		diamond.draw();
		
		((Square)square).squareMethod();
		square.type="dd";

		
		
	}

}
