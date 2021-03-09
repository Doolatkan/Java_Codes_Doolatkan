package review_session.week5;

public class Question1_Swap {

	public static void main(String[] args) {

		swap(5,10);	
		swap(100,250);	

	}

	public static void swap(int num1, int num2) {
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		System.out.println("---------------------------");
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		System.out.println("---------------------------");
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		
		
		
	}
	
	

}
