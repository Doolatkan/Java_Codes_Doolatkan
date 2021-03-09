package day8_ifElseIfElseIfElseStatements;

public class task32_LargestNumber {

	public static void main(String[] args) {


		int a,b,c;
		a=40;
		b=10;
		c=0;
		
		if (a>b && a>c) {
			System.out.println("Number " + a + " largest than " + b + " and " + c);
		}else if (b>a && b>c) {
			System.out.println("Number " + b + " largest than " + a + " and " + c);
		}else if (c>a && c>b) {
			System.out.println("Number " + c + " largest than " + a + " and " + b);
		}else  {
			System.out.println("Numbers are equal");
		
		}

	}

}
