package day8_ifElseIfElseIfElseStatements;

public class SyntaxNestedIfStatements {

	public static void main(String[] args) {


		int salary = 3000;
		double yearsOnJob = 1.6;
		
		if(salary>=3000) {
			if(yearsOnJob>=2) {
			System.out.println("You qualify for the loan");
			}else {
				System.out.println("You must have been on your current job at least 2 years to qualify");
			}
		}else {
			System.out.println("You must earn at least $30,000 per year");
		}
		
		System.out.println("***********************");
		
		boolean isRushHour = false;
		int carType = 1;
		double  price = 0.0;
		
		if(carType == 1) {
			if(isRushHour) {
				price = 30.0;
			}else {
				price = 5.0;
			}
		} else if(carType == 2) {
			if(isRushHour) {
				price = 55.30;
			}else {
				price = 15.99;
			}
		}
		System.out.println("Toll Cost: " + price);
	}
		
	}


