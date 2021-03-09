package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		System.out.println("Table of " + num);
		System.out.println("--------------------");
		for(int i=1;i<=10;i++) {
			int table = num*i;
			System.out.println(num + " x " + i + " = " + table);
		}

	}

}
