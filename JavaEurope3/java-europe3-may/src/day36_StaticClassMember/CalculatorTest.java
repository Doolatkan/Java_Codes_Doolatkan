package day36_StaticClassMember;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.plus(2, 4));
		
		System.out.println(Calculator.plus(2, 4));
		
		System.out.println(Math.PI);
		
		int i= Integer.parseInt("33");
		System.out.println(i);
		
		System.out.println(Character.isDigit('4'));
		//1way
		CalculatorTest.mA();
		
		//2 way
		CalculatorTest ct = new CalculatorTest();
		ct.mA();
		
		//3 way
		mA();
		
	}
	
	public static void mA() {
		System.out.println("Hello");
	}

}
