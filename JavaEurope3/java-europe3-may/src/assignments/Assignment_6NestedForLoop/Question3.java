package assignments.Assignment_6NestedForLoop;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = scan.nextInt();
		System.out.println();
		
		
			for(int i=1;i<=num;i++) {			
				for(int j=1;j<=num;j++) {
					if(j>=i) 
					System.out.print(j+" ");
					else			
				System.out.print(" ");
					}
				System.out.println();
				}
			for(int i=num-1;i>=1;i--) {			
				for(int j=1;j<=num;j++) {
					if(j>=i) 
					System.out.print(j+" ");
					else			
				System.out.print(" ");
					}
				System.out.println();
				}
				
			       
					
				
	}
}
			
			
		


