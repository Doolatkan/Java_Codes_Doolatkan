package day23_stringManipulation_Lab2;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String answersTrue = "ABCDabcd";	
		int count = 0;
		System.out.println("This test will check your knowlages from testing!!!");
		
		System.out.println("==========================================================================================");
		System.out.println("1) Software Development Life Cycle? ");
		System.out.println("\na) is a process for planning, creating, testing, and deploying an information system.       b) is a process of planning, creating, testing and driving a car.");
		System.out.println("c) is a planing a day.                                                                      d) all answers are true");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("Your answer? ");
		String userAnswer = scan.next();
		while(!answersTrue.contains(userAnswer)) {
			System.out.print("Answer can be (a,b,c,d) or (A,B,C,D). Try it again:");
			userAnswer = scan.next();
		}
		if(userAnswer.equalsIgnoreCase("a")) {
			count++;
		    System.out.println("                                        CORRECT!!!");
		}else {
			System.out.println("                                        incorrect :(");
			System.out.println("Correct answer is \"a\".");
		}
		
		
		System.out.println("==========================================================================================");
		System.out.println("2) SDLC Steps? ");
		System.out.println("\na) Planning, creating, and deploying.                                                        b) Requirement, design, coding, testing, production, deploying.");
		System.out.println("c) Requirement, design, coding, testing, production.                                         d) verification and validation");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("Your answer? ");
	    userAnswer = scan.next();
		while(!answersTrue.contains(userAnswer)) {
			System.out.print("Answer can be (a,b,c,d) or (A,B,C,D). Try it again:");
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
		System.out.println("3) What is software development methodology?");
		System.out.println("\na) Model/ framework that describes the activities performed each work day.                   b) a way of doing something; procedure; process; esp., a regular, orderly, definite procedure or way of teaching, investigating, etc.");
		System.out.println("c) All answers are true.                                                                     d) Model/ framework that describes the activities performed at each stage of a SDLC. ");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("Your answer? ");
	    userAnswer = scan.next();
		while(!answersTrue.contains(userAnswer)) {
			System.out.print("Answer can be (a,b,c,d) or (A,B,C,D). Try it again:");
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
		System.out.println("4) Software methodologies on the market?");
		System.out.println("\na) Prototype Methodology, Waterfall Model, V-Model.                                           b) a is true c is not true.");
		System.out.println("c) Rapid Application Development (RAD), Agile methodology, Spiral Model.                      d) all answers are wrong.");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("Your answer? ");
	    userAnswer = scan.next();
		while(!answersTrue.contains(userAnswer)) {
			System.out.print("Answer can be (a,b,c,d) or (A,B,C,D). Try it again:");
			userAnswer = scan.nextLine();
		}
		if(userAnswer.equalsIgnoreCase("c")&& userAnswer.equalsIgnoreCase("a")) {
			count+=2;
		    System.out.println("                                        CORRECT!!!");
		}else if(userAnswer.equalsIgnoreCase("c")) {
			count++;
		    System.out.println("                                        CORRECT!!!");
		}else if(userAnswer.equalsIgnoreCase("a")) {
			count++;
		    System.out.println("                                        CORRECT!!!");
		}else{
			System.out.println("                                        incorrect :(");
			System.out.println("Correct answer is \"a and c\".");
		}
		
		System.out.println("==========================================================================================");
		System.out.println("5) Waterfall Methodology is?");
		System.out.println("\na) Hight flexibility level makes it difficult to make changes while developing.               b)is ability to  changes after process is underway.");
		System.out.println("c) when you develop only near a waterfall.                                                    d) Developed   based   on step   by   step. ");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("Your answer? ");
	    userAnswer = scan.next();
		while(!answersTrue.contains(userAnswer)) {
			System.out.print("Answer can be (a,b,c,d) or (A,B,C,D). Try it again:");
			userAnswer = scan.next();
		}
		if(userAnswer.equalsIgnoreCase("d")) {
			count++;
		    System.out.println("                                        CORRECT!!!");
		}else {
			System.out.println("                                        incorrect :(");
			System.out.println("Correct answer is \"d\".");
		}
		
		System.out.println("Your result:" + count + " from 6");

	}

}
