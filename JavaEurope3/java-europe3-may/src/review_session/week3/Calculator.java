package review_session.week3;

public class Calculator {

	public static void main(String[] args) {


		double num1 = 10.20;
		double num2 = 5.0;
		char operator = '+';
		
		if(operator == '+') {
			System.out.println(num1+num2);
		}else if(operator == '-') {
			System.out.println(num1-num2);
		}else if(operator == '*') {
			System.out.println(num1*num2);
		}else if(operator == '/') {
			System.out.println(num1/num2);
		}else {
			System.out.println("Invalid operator");
		}

	}

}
