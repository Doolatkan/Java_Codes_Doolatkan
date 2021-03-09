package day14_methods_Part2;

import java.util.Scanner;

public class Task70_HightScorePosition {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = scan.next();
		
		System.out.print("Enter score: ");
		int score = scan.nextInt();		
		
		displayHighScorePosition(name, calculateHighScorePosition(score));
	
	}

	public static void displayHighScorePosition(String name, int position) {
		
		System.out.println(name + " managed to get into position " +  position + " on the high score table");
			
	}

	public static int calculateHighScorePosition(int score) {		
		
	    if(score>=100 && score<500) {
			return 3;
		}else if(score>=500 && score<1000) {
			return 2;
		}else if(score>=1000) {
			return 1;
		}else {
			return 4;
		}		
		
	}	
	

}
