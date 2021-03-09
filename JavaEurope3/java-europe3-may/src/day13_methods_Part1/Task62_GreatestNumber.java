package day13_methods_Part1;

public class Task62_GreatestNumber {

	public static void main(String[] args) {


		greatestNumber(80,6,80);
	}

	

	public static void greatestNumber(double num1, double num2, double num3) {


		if(num1>num2 && num1>num3) {
			System.out.println("Greatest number is: " + num1);
		}else if(num2>num1 && num1>num3) {
			System.out.println("Greatest number is: " + num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("Greatest number is: " + num3);
		}else if(num1==num2||num1==num3||num2==num3) {
			System.out.println("Numbers are equal");
		}
		
	}

}
