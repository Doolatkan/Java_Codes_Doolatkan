package day10_controlFlowStatements_Part4;

public class forLoopRules {

	public static void main(String[] args) {


//		for( ; ;) {
//			System.out.println("Hello");
//		}
		
//		int i = 1;
//		for( ; i<=5; i++) {
//		System.out.println(i);
//    	}
//		
//		for( ; ; i++) {
//			System.out.println(i);
//		}
//		
//		for(  ; i<=5; ) {
//			System.out.println(i);
//		}
		
		// Adding multiple terms to the for statement
//		 int x=0;
//		 
//		 for(long y=0, z=4; x<5 && y<10; x++, y++) {
//			 System.out.print(y + " " );
//		 }
//		 System.out.print( x );
		
		 
//		 for(int i=0;i<=5;i++) {
//			 System.out.println(i);
//		 }
//		 
//		 for(int i=0;i<=5;i++) {
//			 System.out.println(i);
//		 }
//		 
//		 for(int i=0;i<=5;i++) {
//			 System.out.println(i);
//		 }
		
		
		// Redeclaring a variable in the init block
		
//		int x= 0;
//		long y = 0;		
//		for(long y=0, x=4; x<5&&y<10; x++, y++) { // does not compile
//			System.out.println("Hello");
//		}
//		
		
//		 int x = 0;
//		 long y = 0;
//		  for(y=1, x=4; x<5 && y<10; x++, y++) {
//			  System.out.println("Hello");
//		  }
		
		
		//4-Using incompatible data types in the int block
		//the variables in the init block must all be of  the same data type
		
//		for(long y=0, int x=0;  x<5 && y<10; x++, y++) { //
//		  System.out.println("Hello");
//		}

	}

}
