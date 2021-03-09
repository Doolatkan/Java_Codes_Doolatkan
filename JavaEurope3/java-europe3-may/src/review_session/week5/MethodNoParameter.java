package review_session.week5;

public class MethodNoParameter {

	public static void main(String[] args) {

     countFrom1to10();
     countFrom1to10();
 
     printAtoZ();

	}
	
	public static void countFrom1to10() {
		
		for(int k=1;k<=10;k++) {
			System.out.print(k+ " ");
		}
		System.out.println();
		
		
	}
	
	public static void printAtoZ() {
		char i;
		char i2;
		for( i = 'A'; i<='Z'; i++) {			
		for( i2 = i; i2<=i; i2++) {
			System.out.print(i);
			System.out.print(i2+" ");
		}	
		}
		
		System.out.println();
	}

}
