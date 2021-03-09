package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter upper bound: ");
		int upperBound = scan.nextInt();
		int i=1;
		int sum = 0;
		System.out.println("Sum of the numbers from 1 till " + upperBound + ":");
		while(i<=upperBound) {
			System.out.print(i);
			sum=sum+i;
			if(i<upperBound) {
			System.out.print(" + ");
		}
			i++;
		}

		System.out.print(" = " + sum);
	}

}
