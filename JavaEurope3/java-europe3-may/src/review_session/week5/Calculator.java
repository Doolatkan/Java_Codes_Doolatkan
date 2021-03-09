package review_session.week5;

public class Calculator {

	public static void main(String[] args) {
		
		int x = add(10,20);		
		System.out.println(x);
		int result = substract(25,20);	
		System.out.println(result);
		
		System.out.println(add(5, 20) + substract(7, 3)*5 + add(10, 7));


	}
	
	public static int add(int num1, int num2) {
		int result = num1+num2;
		
		return result;
	}
	
	public static int substract(int num1, int num2) {
		int result = num1-num2;
		return result;
	}

}
