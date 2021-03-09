package day8_ifElseIfElseIfElseStatements;

public class task33_followingLogic {

	public static void main(String[] args) {
		
		
		int marks =0 ;
		
		if (marks <60 && marks >0) {
			System.out.println("\"Fail\"");
		}else if(marks >= 60 && marks < 90) {
			System.out.println("\"Pass\"");
		}else if(marks >= 90) {
			System.out.println("\"Passed with Distiction\"");
		}else if(marks < 0) {
			System.out.println("\"Invalid score\"");
		}else {
			System.out.println("marks = " + marks);
		}

	}

}
