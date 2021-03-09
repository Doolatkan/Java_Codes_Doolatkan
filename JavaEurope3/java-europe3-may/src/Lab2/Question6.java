package Lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of a purchase:");
        double amount = scan.nextDouble();
        
        double stateSalesTax = (amount * 4)/100;
        double countySalesTax = (amount * 2)/100;
        double totalSalesTax = stateSalesTax + countySalesTax;
        double totalOfTheSale = amount + totalSalesTax; 
        
        System.out.println("Amount of the purchase: " + amount + "$");
        System.out.println("State sales tax: " + stateSalesTax + "$");
        System.out.println("County sales tax: " + countySalesTax + "$");
        System.out.println("Total sales tax: " + totalSalesTax + "$");
        System.out.println("Total Of The Sale: " + totalOfTheSale + "$");
        
        

	}

}
