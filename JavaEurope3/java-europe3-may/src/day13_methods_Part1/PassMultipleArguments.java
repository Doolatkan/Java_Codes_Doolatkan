package day13_methods_Part1;

public class PassMultipleArguments {

	public static void main(String[] args) {
		
		showSum(5,true);
		showSum(20,8>10);
		showSum(40,7==1+6);
		showSum(2,30<25);
	}
	
	public static void showSum(int num1, boolean num2) {
		System.out.println(num1+""+num2);
		
	}

}
