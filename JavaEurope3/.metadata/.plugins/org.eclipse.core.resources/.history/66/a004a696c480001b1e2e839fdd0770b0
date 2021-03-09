package day23_stringManipulation_Lab2;

import java.util.*;


public class Dice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("You roll the bone:");
		System.out.print("Enter number of dice between(1-6):");
		int userDice = scan.nextInt();
		while(userDice>6 && userDice<0) {
			System.out.print("Invalid number. Try it again:");
			userDice = scan.nextInt();
		}
		Random rn = new Random();		
		int dice = rn.nextInt(6)+1;
		
		String answer="y";		
		
		while(answer.equalsIgnoreCase("y")){
			System.out.println("your bone: " + userDice);
			System.out.println("computer bone: " + dice);
			
			if(userDice>dice) {
				System.out.println("you are a Winner!");
				
			}else if(userDice<dice){
				System.out.println("winner is COMPUTER!");
				
			}else if(userDice==dice) {
				System.out.println("winner is FRIENDSHIP!!!");
			}
			System.out.print("Do you want play again?(yes=y):");
			answer = scan.next();
			if(!answer.equalsIgnoreCase("y")) {
				break;
			}
			
		    System.out.print("Enter number of dice between(1-6):");
		    userDice = scan.nextInt();
			while(userDice>6&&userDice<0) {
				System.out.print("Invalid number. Try it again:");
				userDice = scan.nextInt();
			}					
		    dice = rn.nextInt(6)+1;
		}

	}

}
