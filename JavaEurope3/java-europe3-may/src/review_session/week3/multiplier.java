package review_session.week3;

import java.util.Scanner;

public class multiplier {

	public static void main(String[] args) {


		Scanner in = new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num = in.nextInt();
		System.out.print("Enter num2:");
		int num2 = in.nextInt();
		
		
		int res = num*num2;
		System.out.println(num + "*" + num2 + "=" + res);
		

	}

}
