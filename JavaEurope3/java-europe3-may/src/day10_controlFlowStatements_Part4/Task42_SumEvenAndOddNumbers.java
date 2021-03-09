package day10_controlFlowStatements_Part4;

public class Task42_SumEvenAndOddNumbers {

	public static void main(String[] args) {

         int even=0, odd=0;
		 for(int i=1; i<=100; i++) {
			 if(i%2==0) {
				even=even+i;		    
			 }else {
				odd=odd+i;			
			 }			
		 }
		
		 System.out.println("Sum of even = " + even);
		 System.out.println("Sum of Odd = " + odd);
		 

	}

}
