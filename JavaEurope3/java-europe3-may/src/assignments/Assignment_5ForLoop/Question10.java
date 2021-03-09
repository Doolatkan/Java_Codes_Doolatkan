package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int i =scan.nextInt();
		for(int j=1; j<=i; j++) {
			for(int k=1; k<=j;k++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
