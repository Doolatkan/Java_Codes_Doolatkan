package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();		
		int product = num*10;
		System.out.println(num + "*" + 10 + " = " + product);
		
		while(product>=99) {			
			
			
			System.out.print(product);
			if(product>99) {
				System.out.print(", ");
			}
			
			product--;
			
		}
		

	}

}
