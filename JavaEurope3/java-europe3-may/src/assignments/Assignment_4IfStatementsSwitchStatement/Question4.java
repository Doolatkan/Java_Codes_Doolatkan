package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

         Scanner in = new Scanner(System.in);
         System.out.println("Enter calls:");
         int calls = in.nextInt();
         double per = 0, per1 = 2, per2 = 0.60, per3 = 50*0.50, per4 = 0.40; 
         if(calls < 100) {
        	 per = calls*2;
        	 System.out.println("For " + calls + " per is: $" + per);
         }else if(calls>=100 && calls<150) {
        	 per = (calls - 100)*0.60 + (100*2);
        	 System.out.println("For " + calls + " per is: $" + per);
         }else if(calls>=150 && calls < 200){
        	 per = (per-150)*0.50+(50*0.60)+(100*2);
        	 System.out.println("For " + calls + " per is: $" + per);
         }else if(calls>=200){
        	 per = (per-200)*0.40+(50*0.50)+(50*0.60)+(100*2);
        	 System.out.println("For " + calls + " per is: $" + per);
         }
		

	}

}
