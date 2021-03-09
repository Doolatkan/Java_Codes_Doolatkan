package Lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int largest, smallest;
		Scanner scan = new Scanner(System.in);	
		System.out.print("Enter your first number: ");
		largest = smallest = scan.nextInt();	
		int yesNo=1;
		
		while(yesNo==1) {System.out.print("Enter your next number: ");
		    int num = scan.nextInt();
		    largest = largest>num ? largest : num; 	        	   
		    smallest = smallest<num ? smallest : num;        	   
		    System.out.print("Do you wan't to enter another number: 0-No, 1-Yes ");			
	        yesNo = scan.nextInt();	        
	    } if(yesNo<0||yesNo>1) {
	    	System.out.println("Invalid input");
	      }else {		
		    System.out.println("Smallest Number is: " + smallest);
	        System.out.println("Largest Number is: " + largest);
	      }
	}
}

	    
	


