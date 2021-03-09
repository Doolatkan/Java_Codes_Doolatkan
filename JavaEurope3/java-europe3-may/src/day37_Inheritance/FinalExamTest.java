package day37_Inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many questions in the exam?");
		int question = scan.nextInt();
		System.out.println("How many questions is missed?");
		int missed = scan.nextInt();
		
		FinalExam f1 = new FinalExam(question, missed);
		System.out.println("Your grade is: " + f1.getGrade());

	}

}
