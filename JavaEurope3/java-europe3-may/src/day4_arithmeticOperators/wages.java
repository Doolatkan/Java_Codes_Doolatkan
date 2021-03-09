package day4_arithmeticOperators;


//This program calculates hourly wages plus overtime
public class wages {

	public static void main(String[] args) {
	
		double regularWage; //The calculated regular wage
		double basePay = 25.75; //The base pay
		double regulareHours = 40; //The hours worked lrss overtime
		double overTimeWages; //Overtime wages
		double overTimePay = 37.5; //Overtime Pay rate
		double overTimesHours = 15;
		double totalWages; //Total Wage
		
		regularWage=basePay*regulareHours;
		overTimeWages=overTimePay*overTimesHours;
		
		totalWages=regularWage+overTimeWages;
		
		System.out.println("Wages for this week are $ " + totalWages);
		

	}

}
