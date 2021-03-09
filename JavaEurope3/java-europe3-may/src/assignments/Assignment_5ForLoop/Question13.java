package assignments.Assignment_5ForLoop;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {


		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter number of rows:");
	        int w = scan.nextInt();
	        System.out.print("Enter number of colmns:");
	        int b = scan.nextInt();
	        for(int rows = 0; rows<w; rows++)
	        {
	            for(int cols = 0; cols<b; cols++)
	            {
	                if((rows+cols)%2 ==0) System.out.print("W ");
	                else System.out.print("B ");
	            }
	            System.out.println();
	        }
	}

}
