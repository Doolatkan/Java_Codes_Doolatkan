package day25_arrays_part2;

import java.util.Arrays;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	double[] rainfall = new double[12];
	String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	System.out.println("Please enter in the following rainfall for the months ahead:");
	System.out.println("Month    Rainfall(in inches");	
	
	for(int i=0; i<months.length;i++) {
		System.out.print(months[i] + ":");
		rainfall[i] = scan.nextDouble();
		while (rainfall[i]<0.0) {
				System.out.println("Rainfall can not be minus: Try it again:");
				System.out.print(months[i] + ":");
				rainfall[i] = scan.nextDouble();
		}
		
	}
	
	  System.out.println("The sum of all the rain is: " + totalRainfall(rainfall) + " inches");
	  System.out.println("The average rainfall was: " + averageRainfall(rainfall, totalRainfall(rainfall)) + " inches");
	  System.out.println("The max rain is: " + maxRainfall(rainfall) + " inches");
	  System.out.println("The min rain is: " + minRainfall(rainfall) + " inches");	 

	}
	
	public static double totalRainfall(double[] rainfall) {
		
		double sum = 0;
		for(int i=0; i<rainfall.length; i++) {
			sum = sum + rainfall[i];
		}		
			return sum;		
	}
	
	public static double averageRainfall(double[] rainfall, double sum) {
		
		
		double average = Math.round((sum/rainfall.length) * 1000.0)/1000.0;
		
		return average;
		
	}
	
	public static double maxRainfall(double[] rainfall) {
		double max = 0;
		for(double inches : rainfall) {
			if(max<inches) {
				 max=inches;
			}else {
				 max=max;
			}
		}
		return max;
	}
	
	public static double minRainfall(double[] rainfall) {
		double min = 0;
		for(double inches : rainfall) {
			if(min>inches) {
				 min=inches;
			}else {
				 min=min;
			}
		}
		return min;
	}
	

}
