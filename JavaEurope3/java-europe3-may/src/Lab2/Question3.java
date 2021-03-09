package Lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int num = s.nextInt();
        int total=0;
        if(num<1) {
        	System.out.println("Invalid number");
        }else {
        	for(int i=1;i<=num;i++){
        	total=total+i;	
        	}
        	System.out.println("Total number is " + total);
        }
		

	}

}
