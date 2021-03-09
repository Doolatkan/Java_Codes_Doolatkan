package day13_methods_Part1;

public class PassArg {

	public static void main(String[] args) {

   
		double x = 10;
		
		displayValue(7);
		System.out.println();
		
		displayValue((int)x);
		System.out.println();
		
		displayValue((int)x-5);
		
		

	}
	
	public static void displayValue(int num) {
		
		System.out.println("The value is: " + num);
		if(num>=3) {
		System.out.println("The value is: " + num*num);
		num--;
		int num1 = num;
		System.out.println("The value is " + num1);
		
		if(num%2==0) {
			System.out.println(num + " is even number");
		}else {
			System.out.println(num + " is odd number");
		}
		}

	}

}
