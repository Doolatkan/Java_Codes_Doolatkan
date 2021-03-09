package review_session.week8;

import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		for(int i=0; i<scores.length; i++) {
			System.out.print("Enter score " + (i+1) + ":");
			scores[i] = scan.nextInt();
		}
		
		//print all scores in one line
		for(int score : scores) {
			System.out.print(score + ", ");
		}
		System.out.println();
		//find the max /largest score
		int max = 0;
		for(int val : scores) {
			if(val>max) {
				max=val;
			}
		}
		
		System.out.println("max is:" + max);
		
		int min = scores[0];
		for(int val : scores) {
			if(val<min) {
				min=val;
			}
		}
		
		System.out.println("min is:" + min);
		

	}

}
