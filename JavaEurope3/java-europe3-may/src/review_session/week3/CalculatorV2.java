package review_session.week3;

public class CalculatorV2 {

	public static void main(String[] args) {


		double num1 = 10.20;
		double num2 = 5.0;
		String operator = "+";
		
		switch(operator) {
		
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		default: 
			System.out.println("Invalid operator");
		}

	}

}
