package review_session.week4;

public class CountWhileLoop {

	public static void main(String[] args) {


		int count = 1;
		while(count<=10) {
			int count1 = 1;
			while(count1<=count) {
				System.out.print(count1);	
				
				count1++;				
			}
			
		//System.out.print(count+" ");
		count++;
		System.out.println();
		}

		System.out.println();
		
		int counter = 10;
		while(counter>=1) {
		System.out.print(counter+" ");
		counter--;
		}
	}

}
