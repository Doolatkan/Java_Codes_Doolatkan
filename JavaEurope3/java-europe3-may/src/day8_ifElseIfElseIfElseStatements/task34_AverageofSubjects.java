package day8_ifElseIfElseIfElseStatements;

public class task34_AverageofSubjects {

	public static void main(String[] args) {

          int subject1 = 80;
          int subject2 = 80;
          int subject3 = 80;
          double average = (subject1+subject2+subject3)/3;
          System.out.println("Average is " + average);
          
          if(average>=0 && average<=59) {
        	  System.out.println("Grade is F");
          }else if(average >= 60 && average<=69) {
        	  System.out.println("Grade if D");
          }else if(average >= 70 && average<=79) {
        	  System.out.println("Grade is C");
          }else if(average >=80 && average<=89) {
        	  System.out.println("Grade is B");
          }else if(average>=90 && average <= 100) {
        	  System.out.println("Grade is A");
          }else if (subject1 < 0 || subject1>100 || subject2 < 0 || subject2>100 || subject3 < 0 || subject3>100) {
        	  System.out.println("Invalid number");
          }           
        
	}

}
