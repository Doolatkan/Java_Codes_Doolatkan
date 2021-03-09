package day13_methods_Part1;

public class Task65_grades {

	public static void main(String[] args) {


		averageNumber(100,50,100);

	}

	public static void averageNumber(int grade1, int grade2, int grade3) {
		
            int average = (grade1+grade2+grade3)/3;
            if(average>=0&&average<60) {
            	System.out.println("AVERAGE: " +  average + " GRADE: F");
            }else if(average>=60&&average<70) {
            	System.out.println("AVERAGE: " + average + " GRADE: D");
            }else if(average>=70&&average<80) {
            	System.out.println("AVERAGE: " + average + " GRADE: C");
            }else if(average>=80&&average<90) {
            	System.out.println("AVERAGE: " + average + " GRADE: B");
            }else if(average>=90&&average<=100) {
            	System.out.println("AVERAGE: " + average + " GRADE: F");
            }else  {
            	System.err.println("Invalid input");
            }
		
	}

}
