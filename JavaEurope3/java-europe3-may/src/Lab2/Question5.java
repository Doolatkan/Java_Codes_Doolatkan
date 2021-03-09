package Lab2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the charge for the meal:");
        double charge = s.nextDouble();
        System.out.println("Meal charge: " + charge + "$");
        double tax = Math.round(((charge/100)*6.75)*100.0)/100.0;
        System.out.println("Tax: " + tax + "$");
        double tip =Math.round((((charge+tax)/100)*20)*100)/100.0;
        System.out.println("Tip: " + tip + "$");
        double total =charge+tax+tip;
        System.out.println("Total bill: " + total + "$");

	}

}
