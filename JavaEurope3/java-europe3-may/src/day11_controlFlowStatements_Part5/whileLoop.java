package day11_controlFlowStatements_Part5;

public class whileLoop {

	public static void main(String[] args) {


		//print 0-10
		
//		int i= 0;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		// using a loop, iterate untill we have 10 students in the room
		
		int numberOfStudent=1;
		
		while(numberOfStudent<=10) {
			System.out.println("Student " + numberOfStudent);
			numberOfStudent++;			
		}
		
	//print 11,10,9,8...1
		int num=11;
		while(num>=1) {
			System.out.print(num + " ");
			num--;
		}

	}

}
