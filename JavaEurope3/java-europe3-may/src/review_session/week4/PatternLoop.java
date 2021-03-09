package review_session.week4;

import java.util.Scanner;

public class PatternLoop {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=scan.nextInt();
		
		for(int i=0;i<=num;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		

		for(int i=num-1;i>=0;i--) {
			for(int j=0; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
