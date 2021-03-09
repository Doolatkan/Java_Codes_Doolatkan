package day23_stringManipulation_Lab2;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {	
		
				
				Scanner scan = new Scanner(System.in);
				String answersTrue = "ABCDabcd";	
				int count = 0;
				System.out.println("Logic And Math Interesting 8-Questions!");
				
				System.out.println("==========================================================================================");
				System.out.println("1) There are 60 marbles in a bowl. Their colors are red, blue, and yellow. 1/3 of the marbles are yellow, 1/4 of the marbles are blue. \n   How many red marbles are there in the bowl?!!! ");
				System.out.println("\na) 30        b) 25");
				System.out.println("c) 28        d) 32");
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print("Your answer? ");
				String userAnswer = scan.next();
				while(!answersTrue.contains(userAnswer)) {
					System.out.print("Answer can be (a,b,c,d). Try it again:");
					userAnswer = scan.next();
				}
				if(userAnswer.equalsIgnoreCase("b")) {
					count++;
				    System.out.println("                                        CORRECT!!!");
				}else {
					System.out.println("                                        incorrect :(");
					System.out.println("Correct answer is \"b\".");
				}
				
				
				System.out.println("==========================================================================================");
				System.out.println("2) What is the next number in the following sequence 4 16 5 25 6 36 7 49 8");
				System.out.println("\na) 56        b) 64");
				System.out.println("c) 36        d) 52");
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print("Your answer? ");
				userAnswer = scan.next();
				while(!answersTrue.contains(userAnswer)) {
					System.out.print("Answer can be (a,b,c,d). Try it again:");
					userAnswer = scan.next();
				}
				if(userAnswer.equalsIgnoreCase("b")) {
					count++;
				    System.out.println("                                        CORRECT!!!");
				}else {
					System.out.println("                                        incorrect :(");
					System.out.println("Correct answer is \"b\".");
				}
				
				System.out.println("==========================================================================================");
				System.out.println("3) What is 26x8?");
				System.out.println("\na) 158        b) 198");
				System.out.println("c) 168        d) 208");
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print("Your answer? ");
				userAnswer = scan.next();
				while(!answersTrue.contains(userAnswer)) {
					System.out.print("Answer can be (a,b,c,d). Try it again:");
					userAnswer = scan.next();
				}
				if(userAnswer.equalsIgnoreCase("d")) {
					count++;
				    System.out.println("                                        CORRECT!!!");
				}else {
					System.out.println("                                        incorrect :(");
					System.out.println("Correct answer is \"d\".");
				}
				
				
				System.out.println("==========================================================================================");
				System.out.println("4) How many legs (total ) do 4 dogs, 2 elephants, 15 cats, and 26 people have?");
				System.out.println("\na) 98         b) 110");
				System.out.println("c) 136        d) 142");
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print("Your answer? ");
			    userAnswer = scan.next();
				while(!answersTrue.contains(userAnswer)) {
					System.out.print("Answer can be (a,b,c,d). Try it again:");
					userAnswer = scan.next();
				}
				if(userAnswer.equalsIgnoreCase("c")) {
					count++;
				    System.out.println("                                        CORRECT!!!");
				}else {
					System.out.println("                                        incorrect :(");
					System.out.println("Correct answer is \"c\".");
				}
				
				
				System.out.println("==========================================================================================");
				System.out.println("5) John works 4 days per week. He drives 10 miles round trip per day. If gas is $2.50 per gallon and his car gets 20 miles to the gallon,\n how much would he have spent on gasoline in 2 weeks getting back and forth to work?");
				System.out.println("\na) $8.50         b) $10.00");
				System.out.println("c) $12.00        d) $9.50");
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print("Your answer? ");
			    userAnswer = scan.next();
				while(!answersTrue.contains(userAnswer)) {
					System.out.print("Answer can be (a,b,c,d). Try it again:");
					userAnswer = scan.next();
				}
				if(userAnswer.equalsIgnoreCase("b")) {
					count++;
				    System.out.println("                                        CORRECT!!!");
				}else {
					System.out.println("                                        incorrect :(");
					System.out.println("Correct answer is \"b\".");
				}
				
				
				System.out.println("==========================================================================================");
				System.out.println("6) What is the next letter in the following sequence?J, F, M, A, M, J, ______");
				System.out.println("\na) A        b) J");
				System.out.println("c) K        d) F");
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print("Your answer? ");
			    userAnswer = scan.next();
				while(!answersTrue.contains(userAnswer)) {
					System.out.print("Answer can be (a,b,c,d). Try it again:");
					userAnswer = scan.next();
				}
				if(userAnswer.equalsIgnoreCase("b")) {
					count++;
				    System.out.println("                                        CORRECT!!!");
				}else {
					System.out.println("                                        incorrect :(");
					System.out.println("Correct answer is \"b\".");
				}
				
				
				System.out.println("==========================================================================================");
				System.out.println("7) Jack goes fishing on Saturday and catches  32 fish. On Sunday, he catches 1/4 the amount of fish he caught on Saturday. \nOn Monday he catches 1/2 the fish he caught on Saturday and Sunday combined. How many fish did he catch on Monday?");
				System.out.println("\na) 24        b) 16");
				System.out.println("c) 18        d) 20");
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print("Your answer? ");
			    userAnswer = scan.next();
				while(!answersTrue.contains(userAnswer)) {
					System.out.print("Answer can be (a,b,c,d). Try it again:");
					userAnswer = scan.next();
				}
				if(userAnswer.equalsIgnoreCase("d")) {
					count++;
				    System.out.println("                                        CORRECT!!!");
				}else {
					System.out.println("                                        incorrect :(");
					System.out.println("Correct answer is \"d\".");
				}
				
				

				System.out.println("==========================================================================================");
				System.out.println("8) Ned has a fruit stand. Normally he sells apples for 40 cents a piece, but today he has apples on sale for 5 for $ 1. \n  There are no limits on quantity. If you bought 16 apples at the sale price, how much money would you have saved?");
				System.out.println("\na) $3.20        b) $2.80");
				System.out.println("c) $2.60        d) $3.00");
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print("Your answer? ");
			    userAnswer = scan.next();
				while(!answersTrue.contains(userAnswer)) {
					System.out.print("Answer can be (a,b,c,d). Try it again:");
					userAnswer = scan.next();
				}
				if(userAnswer.equalsIgnoreCase("a")) {
					count++;
				    System.out.println("                                        CORRECT!!!");
				}else {
					System.out.println("                                        incorrect :(");
					System.out.println("Correct answer is \"a\".");
				}
				
				System.out.println("\n*********************************End questions.*****************************************");
				System.out.println("");
				
				if(count==0) {
					System.out.println("Your result " + count + " from 8. :(");
				}else if(count>=1 && count<3) {
					System.out.println("Your result " + count + " from 8. Not bad");
				}else if(count>=3 && count<5){
					System.out.println("Your result " + count + " from 8. Goog!");
				}else if(count>=5 && count<=6) {
					System.out.println("Your result " + count + " from 8. Very good!!!");
				}else {
					System.out.println("Your result " + count + " from 8. Gread!!! :)");
				}		


	}

}
