package homeWork;

import java.util.Scanner;

public class Carpet_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter width of carpet:");
		
		double width = scan.nextDouble();
		
        System.out.println("Enter length of carpet:");
		
		double length = scan.nextDouble();
		
        System.out.println("Enter cost of carpet:");
		
		double cost = scan.nextDouble();
		
		if(width<0) {
			width = 0;
		}
		
		if(length<0) {
			length=0;
		}
		
		if(cost<0) {
			cost = 0;
		}	
		
		Floor f1 = new Floor(width, length);
		Carpet c1 = new Carpet(cost);
		Calculator cal1 = new Calculator(f1, c1);
		
		System.out.println("Total cost = " + cal1.getTotalCost());
		

	}

}
