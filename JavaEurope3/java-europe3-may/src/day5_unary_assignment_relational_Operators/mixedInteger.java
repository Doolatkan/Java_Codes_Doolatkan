package day5_unary_assignment_relational_Operators;

public class mixedInteger {

	public static void main(String[] args) {


		int i1=5;
		int i2=10;
		float f1=15.5f;
		double d1=20.5;
		 
		int res1 =i1+i2;//or higher
		//float res2 =i1+f1;//or double
		double res3=i2+d1;
		
		short firstNumber = 10;
		short secondNumber = 20;
		
		int thirdNumber = firstNumber+secondNumber;//or higher
		short thirdNumber2 = (short)(firstNumber+secondNumber);
		
//		byte b1 = 20;
//		byte b2 = 2;
//		int b3 = b1*b2;//or higher
//		byte b4 =(byte)(b1*b2);
		
		int b1 =126;
		int b2 = 1;
		
		//boolean isDoorOpen = true;
		boolean isDoorOpen = false;
		System.out.println(isDoorOpen);
		
		
		byte res = (byte)(b1+b2); //Casting is required
		
		byte res2 = 126+1;//No casting is required
		
		
		 int pies =10, people = 4;
		 double piesPerson;
		 piesPerson=(double)(pies/people);
		 System.out.println(piesPerson);
		 
		 
		

	}

}
