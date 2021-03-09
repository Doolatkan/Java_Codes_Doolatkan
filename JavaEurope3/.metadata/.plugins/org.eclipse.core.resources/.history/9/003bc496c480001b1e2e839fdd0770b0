package day23_stringManipulation_Lab2;

import java.util.*;

public class Task83 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.println("rolling the dice:");
		
		int dice1 = rn.nextInt(6)+1;
		int dice2 = rn.nextInt(6)+1;
		
		System.out.println("Their values are:" + dice1 + " " + dice2);
		
		System.out.print("Roll them again (y=yes)?");
		String answer = scan.nextLine();
		
		while(answer.equalsIgnoreCase("y")){
		    
		    System.out.println("rolling the dice:");
			System.out.println("Their values are:" + dice1 + " " + dice2);
			System.out.print("Roll them again (y=yes)? ");
			answer = scan.nextLine();
			dice1 = rn.nextInt(6)+1;
			dice2 = rn.nextInt(6)+1;
		}
		
		

	}

}
