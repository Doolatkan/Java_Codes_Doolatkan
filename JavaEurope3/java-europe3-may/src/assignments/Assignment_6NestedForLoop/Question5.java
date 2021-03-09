package assignments.Assignment_6NestedForLoop;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if((j+i)>num) {
				System.out.print(i);
				}else {
					System.out.print(1);
				}
			}
			System.out.println();	
		}
		

	}

}
