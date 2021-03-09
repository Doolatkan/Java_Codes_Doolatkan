package day23_stringManipulation_Lab2;
import java.util.*;
public class SecretNumber {

	public static void main(String[] args) {		
		        
						Scanner scan = new Scanner(System.in);
						Random rn = new Random();
						System.out.println("This play between you and computer. You have to find a secret number!");
						
						System.out.print("Enter number between(1-10):");
						int userNumber = scan.nextInt();
						while(userNumber>10 || userNumber<1) {
							System.out.print("Invalid number. Try it again:");
							userNumber = scan.nextInt();
						}
						
						int secretNumber = rn.nextInt(10)+1;
						int compNumber = rn.nextInt(10)+1;
						
						String answer = "stop";
						
						while(answer.equalsIgnoreCase("stop")){						
							
							System.out.println("your number: " + userNumber);
							System.out.println("computer number: " + compNumber);
							
							 if(userNumber==secretNumber && compNumber==secretNumber) {
								System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@ winner is FRIENDSHIP!!! @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
							}else if(userNumber!=secretNumber && compNumber!=secretNumber) {
								System.out.println("================ not you not computer found secret number ==============================");
							}else if(userNumber==secretNumber) {
								System.out.println("------------------------you found secret number! ---------------------------------");
								
							}else if(compNumber==secretNumber){
								System.out.println("-----------------------computer found secret number!-----------------------------------");
								
							}					
							
						    System.out.print("Enter number between(1-10):");
						    userNumber = scan.nextInt();
							while(userNumber>10 || userNumber<1) {
								System.out.print("Invalid number. Try it again:");
								userNumber = scan.nextInt();
							}					
							compNumber = rn.nextInt(10)+1;
						}


	}

}
