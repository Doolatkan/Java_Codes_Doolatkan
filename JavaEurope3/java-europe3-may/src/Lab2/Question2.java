package Lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of cookies:");
        int numCook = scan.nextInt();
        int cal = 300/(40/10);
        int totalCal = cal*numCook;
               
        if(numCook>40) {
        	System.out.println("Invalid number of cookies");
        }else {
        	System.out.println("You ate " + totalCal + " calories");
        }
	}

}
