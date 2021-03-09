package day14_methods_Part2.Lab1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Eneter a number:");
		int num = scan.nextInt();
		
		specialEleven(num);

	}

	public static void specialEleven(int num) {


		if(num%11==0||num%11==1) {
			System.out.println(true);
		}else {
			System.err.println(false);
		}
		
	}
	
	

}
