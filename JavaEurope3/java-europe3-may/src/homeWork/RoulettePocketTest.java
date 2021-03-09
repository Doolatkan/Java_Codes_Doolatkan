package homeWork;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a pocket number:");
		int num = scan.nextInt();
		
		if(num<0 || num>36) {
			System.out.println("Invalid pocket number");
		}else {
			RoulettePocket r1 = new RoulettePocket(num);
			
			System.out.println(r1.getPocketColor());
		}		

	}

}
