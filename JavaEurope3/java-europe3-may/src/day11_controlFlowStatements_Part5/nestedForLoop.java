package day11_controlFlowStatements_Part5;

public class nestedForLoop {

	public static void main(String[] args) {


//		for(int x=0;x<=3;x++) {
//			System.out.println("Time x: " + x);
//			for(int y=0;y<=3;y++) {
//				System.out.println("x = " + x + "; y = " + y);
//			}
//			
//		
//		}
		
		for(int i=1;i<=5;i++) {
			System.out.println("Outer Loop Iteration " + i);
			for(int j=1;j<=2;j++) {
				System.out.println("i = " + i + "; j = " + j);
			}
		}
		

	}

}
