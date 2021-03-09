package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number n= ");
		int i = scan.nextInt();

            int k = 0;
            int y=1;
          System.out.println("Fibonacci series of " + i + " terms:");
            for(int j=0; j<i;j++) {
    	        System.out.print(k);
    	        if(j<(i-1)) {
    	        	System.out.print(", ");
    	        }
    	        int fib=k+y;
    	        k=y;
    	        y=fib;
    	  
		    }

	}

}
