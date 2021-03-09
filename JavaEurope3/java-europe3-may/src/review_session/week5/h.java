package review_session.week5;

import java.util.Scanner;

public class h {
	
public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the first number");
	 int min = scan.nextInt();
	 int max=min;
	 
	 boolean anotherValue=true;


	 
	 do{
		 System.out.println("Enter the next number");
		 int variabale2=scan.nextInt();
		 if(min>variabale2) {
			 min=variabale2;
		 }else if(max<variabale2) {
			 max=variabale2;
		 System.out.println("Do you want to add a new number: 0-No 1-Yes");
	     
	     int variable3=scan.nextInt();
		 if(variable3==0) {
	    	anotherValue=false;		    	 
	     
      }
		 }
	 }while(anotherValue); {
   	   
      
	    System.out.println("The maximum number is: " + max);
	    System.out.println("The minimum number is: "+  min);
      }
		
}
}
	 





	


