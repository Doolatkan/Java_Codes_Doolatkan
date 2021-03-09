package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {



		Scanner scan = new Scanner(System.in);
	     System.out.print("Enter number:");
	     
	     int p = scan.nextInt();
	     int y = p;
				
		for(int i=p; i>0; i--){
		      for(int j=i; j>0; j--){
		        System.out.print(j + " ");
		      }
		      System.out.println();
		      for(int k=0; k<=y-i; k++){
	        System.out.print(" ");
	        
				}
		      }
			
			
			
	}
			
}
			
			
		
		
		

	


