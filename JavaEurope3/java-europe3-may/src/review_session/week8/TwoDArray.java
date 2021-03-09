package review_session.week8;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		
		String[][] list  = new String[4][3];
		
		list[0][0] = "Potatoes";
		list[0][1] = "Carrots";
		list[0][2] = "Onions";
		
		list[1][0] = "Apples";
		list[1][1] = "Kiwis";
		list[1][2] = "Figs";
		
		list[2][0] = "Milk";
		list[2][1] = "Egg";
		list[2][2] = "Cheese";
		
		list[3][0] = "Bread";
		list[3][1] = "Bagel";
		list[3][2] = "Muffin";
		
		/*
		 0 - "Potatoes", "Carrots", "Onions"
		 1 - "Apples", "Kiwis", "Figs"
		 2 - "Milk", "Egg", "Cheese"
		 3 - "Bread", "Bagel","Muffin"
		 */
		
		System.out.println(Arrays.deepToString(list));
		
		//print all vegetable using a loop
		
//		for(int i=0; i<1; i++) {
//			System.out.println(Arrays.deepToString(list[0]));
//		}
		
		for(int i=0; i<list[0].length; i++) {
			System.out.println(list[0][i]);
		}
		//print all dairy using for each loop
		for(String val : list[2]) {
			
			System.out.println(val);
		}
		
		
	}

}
