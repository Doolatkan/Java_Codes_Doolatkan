package day7_controlFlowStatements;

public class task25_GreatestNumber {

	public static void main(String[] args) {


		int num1 = 4;
		int num2 = 8;
		int num3 = 100;
		
		if(num1>num2 && num1 > num3) {
			
			
			System.out.println("Greatest is: " +num1);
			
		}
		
		if(num2>num3 && num2>num1) {
			
			System.out.println("Greatest is: " +num2);
		}
		
		if (num3>num1 && num3>num2) {
			
			
			System.out.println("Greatest is: " +num3);
		}
			
		

	}

}
