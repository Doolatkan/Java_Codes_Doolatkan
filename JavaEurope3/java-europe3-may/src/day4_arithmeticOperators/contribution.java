package day4_arithmeticOperators;

public class contribution {

	public static void main(String[] args) {

       /*This program calculates the amount of pay that will be contributed to a retirement
        plan if 5%, 8% or 10% of monthly pay is withheld
        */
		
		double monthlyPay = 6000;
		double contribution5 = monthlyPay*0.05;
		double contribution8 = monthlyPay*0.08;
		double contribution10 = monthlyPay*0.1;
		
		System.out.println("5% is $ " + contribution5 + " per month.");
		System.out.println("8% is $ " + contribution8 + " per month.");
		System.out.println("10% is $ " + contribution10 + " per month.");
		

	}

}
