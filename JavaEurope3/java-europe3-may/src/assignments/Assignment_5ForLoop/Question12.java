package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			int y= 0;
			for(int j=num; j>0; j--) {					
				    y=y+i;
            System.out.print(y+" ");

			}
			System.out.println();
		}

	}

}


