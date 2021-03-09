package day8_ifElseIfElseIfElseStatements;

public class task36_calculatorSwitchStatements {

	public static void main(String[] args) {

		   double num1, num2, res;
		   num1 = 10;
		   num2 = 5;
		   res = 0;
		   
		   String operation = "+";
		   
		   
		   switch (operation){
		   
		   case "+": 
			   res = num1+num2;
			   
			   System.out.println("Result: " + num1 + " + " + num2 + " = " + res);
			   break;
		   case "-": 
			   res = num1-num2;
			   System.out.println("Result: " + num1 + " - " + num2 + " = " + res);
			   break;
		   case "*": 
			   res = num1*num2;
			   System.out.println("Result: " + num1 + " * " + num2 + " = " + res);
			   break;
		   case "/": 
			   res = num1/num2;
			   System.out.println("Result: " + num1 + " / " + num2 + " = " + res);
			   break;
			   
		   }

	}

}
