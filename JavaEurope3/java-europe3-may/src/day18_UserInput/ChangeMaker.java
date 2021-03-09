package day18_UserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a whole number from 1-99:");
        int attempt=0;
             	 do { 
        	    	 int num = scan.nextInt();
        	    	 if(num<1 || num>99) {       	    	     
        	    	     attempt++;
        	    		 if(attempt==3) {
        	    	         System.out.println("Sorry, no more attemp");
        	    	         break;
        	    		 }else {
        	    			 System.out.print("Try again");
        	    		 }
        	    	 }else {        	
        	        	 changeMaker(num); 
        	        	 break;        	        
        	         }
             	 }while(true);	   
        
	}
        
        public static void changeMaker(int num) {
        
        	int quarter = num/25;
        	int dimes  = num%25/10;
        	int nickles = num%25%10/5;
        	int pennies = num%5;
        	System.out.println(num + " cents in coins can be given as:\n" + quarter + " quarters, \n" + dimes + " dimes, \n" + nickles + " nickles, \n" + pennies + " pennies.");
        }
        
}
