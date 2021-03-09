package assignments.Assignment_6NestedForLoop;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0){
					System.out.print(0);
				}else {
					System.out.print(1);
				}
			}
			System.out.println();
		}

	}

}
