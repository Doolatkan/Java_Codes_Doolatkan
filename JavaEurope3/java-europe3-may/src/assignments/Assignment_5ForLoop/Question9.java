package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter end number: ");
		int i = scan.nextInt();
		System.out.println("Odd numbers from 1 till " + i + ":");
		for(int j=1;j<=i;j++) {
			if(j%2!=0) {
					
				System.out.print(j);
				if(i-j==0)
				System.out.print(" ");
				}else if(j<i) {
					System.out.print(", ");
				}
				
			}
		}

	}


