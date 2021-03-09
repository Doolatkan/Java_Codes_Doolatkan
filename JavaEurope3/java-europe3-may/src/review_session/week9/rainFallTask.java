package review_session.week9;

import java.util.*;

public class rainFallTask {

	public static void main(String[] args) {
		
		rainFall rainfall = new rainFall();
		
		Scanner scan = new Scanner(System.in);
		
		double[] rain = new double[12];
		
		String[] months = {
				"Jan", "Feb", "March",
				"April", "may", "June",
				"July", "August", "Sep",
				"Oct", "Nov", "Dec"};
		
		System.out.println("Please enter in the following rainfall for the months ahead:");
		System.out.println("Month\tRainfall(In inches)");
		
		for(int i=0; i<months.length; i++) {
			System.out.print(months[i] + ": ");
			rain[i] = scan.nextDouble();
			while(rain[i]<0) {
				System.out.println("Do not enter a negative number. Re enter:");
				rain[i] = scan.nextDouble();
			}			
		}
		
		System.out.println("The sum of the all the rain is " + Math.round(rainfall.getSum(rain)*100.00)/100.00);
		System.out.println("The average rainfall was: " + Math.round(rainfall.getAverage(rain)*100.0)/100.0);
		System.out.println("The max rain is: " + rainfall.getMaxValue(rain));
		System.out.println("The min rain is: " + rainfall.getMinValue(rain));
	
	}
		
		

	 

}
