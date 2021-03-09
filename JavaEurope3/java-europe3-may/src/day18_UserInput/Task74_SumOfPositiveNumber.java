package day18_UserInput;

import java.util.Scanner;

public class Task74_SumOfPositiveNumber {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num;
        int sum=0;
        do {
        	System.out.print("Enter a number:");
            num = scan.nextInt();
            if(num>0) {
            sum = sum + num;
            }else {
            	break;
            }
           
        }while(true);
        System.out.println("Total is:" + sum);
    }

}
