package day7_controlFlowStatements;

public class snmallTask2 {

	public static void main(String[] args) {


		int x=110;
		int y=0;
		
		if(x>100) {			
			y=20;		
		}
		else {			
			y = 0;	
		}
		
		System.out.println("x = " + x + " y = " + y );
		
		
		System.out.println("**************************");
		
		int x1 = 0;
		int y1 = 10;
		
		if(y1==100) {			
			x1=1;		
		}
		else {
			x1 = 0;		
		}
		
		System.out.println("x1 = " + x1 + " y1 = " + y1);
		
		
		System.out.println("**************************");
		
		int a, b, c;
		a=20;
		b=0;
		c=0;
		
		if(a<10) {
			b=0;
			c=1;			
		}
		else {
			b = -99;
			c = 0;
		}
		
		System.out.println("a = " + a + " b = " + b + " c = " + c);

		
	}

}
