package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

       Scanner sec  = new Scanner(System.in);
       
       System.out.println("Enter number in seconds:");
       int seconds = sec.nextInt();
       int minutes=0, hours=0, days=0;
       
       if(seconds>=60) {
    	   minutes = seconds/60;
    	   
       }
       if(seconds>=3600){
    	   hours = seconds/3600;    	   
       }
       if(seconds>=86400) {
    	   days = seconds/86400;
       }
       System.out.println("Input senods: " + seconds + "seconds" + ". In that many seconds are:");
       System.out.println(days + "-days " + "\n" + hours + "-hours " + "\n" + minutes + "-minutes ");
		

	}

}
