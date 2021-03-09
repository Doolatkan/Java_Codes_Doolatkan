package day44_oopreview.shapes;

import static day44_oopreview.shapes.ShapeManager.*;


import java.util.*;

public class ShapeActions {

	public static void main(String[] args) {
		
		drawSquare((Square)buildShape("square"));
		drawDiamond((Diamond)buildShape("diamond"));
		drawShape(buildShape("shape"));
		
		List <Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());		
		myList.add(new Diamond());		
		myList.add(new Shape());		
		myList.add(new Square());
		
		drawShape(myList);	
		
		
		
		
		

	}

}
