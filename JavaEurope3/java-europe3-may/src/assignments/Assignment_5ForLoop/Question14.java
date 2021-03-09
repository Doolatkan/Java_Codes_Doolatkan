package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=0; j<=i; j++) {
				if((j==0 || j==i)&&i!=0) {
				System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
