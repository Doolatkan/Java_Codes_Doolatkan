package day23_stringManipulation_Lab2;

import java.util.*;

public class Task85 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		int compCount = 0;
		int userCount = 0;
		System.out.println("comp|user| win?   ");
		System.out.println("---------------------------");
		for(int i=0; i<10; i++) {
			
			int compDice = rn.nextInt(6)+1;
			int userDice = rn.nextInt(6)+1;
			
			System.out.print(" " + compDice + "  |  " + userDice);
			if(compDice>userDice) {
				System.out.println(" | comp win");
				compCount++;
			}else if(compDice<userDice){
				System.out.println(" | user win");
				userCount++;
			}else if(compDice==userDice) {
				System.out.println(" | are the same ");
			}			
		}
		System.out.println("----------------------------");
		System.out.print("Result: " + compCount + " comp count and " + userCount + " user count. \nWinner is ");
		if(userCount>compCount) {
			System.out.println("USER!");
			compCount++;
		}else if(userCount<compCount){
			System.out.println("COMPUTER!");
			userCount++;
		}else if(userCount==compCount) {
			System.out.println("FRIENDSHIP!!!");
		}			
		
		
		
		
		

	}

}
