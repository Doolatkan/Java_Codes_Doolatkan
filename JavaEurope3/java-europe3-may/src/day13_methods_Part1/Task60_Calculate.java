package day13_methods_Part1;

public class Task60_Calculate {

	public static void main(String[] args) {
		
		calculator(6, 3, "+");
		calculator(6, 3, "-");
		calculator(6, 3, "*");
		calculator(6, 3, "/");
		calculator(6, 3, "%");
		calculator(6, 3, "**");
		

	}
	
	public static void calculator(double num1, double num2, String operator) {
		
		switch(operator){			
		case "+":
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + num1*num2);
			break;
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			break;
		case "%":
			System.out.println(num1 + " % " + num2 + " = " + num1%num2);
			break;
		default:
			System.err.println("Invalid input");
			}
		
		if(operator=="+") {
			System.out.println("++");
		}
	}

}
