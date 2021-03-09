package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter quantity of package:");
		
		int pack = scan.nextInt();
		double price = pack*99, discount = 0;
		
		if(pack>=10&&pack<=19) {
			discount = pack*99*0.2;
			price = price -discount;
			
		}else if(pack>=20&&pack<=49) {
			discount = pack*99*0.3;
			price = price -discount;
			
		}else if(pack>=50&&pack<=99) {
			discount = pack*99*0.4;
			price = price -discount;
			
		}else if(pack>=100) {
			discount = pack*99*0.5;
			price = price -discount;			
		}
		System.out.println("Quantitiy of package is:" + pack);
		System.out.println("Discount: $" + discount);
		System.out.println("Total amount of the purchase after discount is: $" + price);

	}

}
