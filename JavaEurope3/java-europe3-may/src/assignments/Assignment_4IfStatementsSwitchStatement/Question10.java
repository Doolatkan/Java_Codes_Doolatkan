package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of calories: ");
		double numCalories = scan.nextDouble();
		System.out.println("Enter a number of fat grams: ");
		double fatGrams = scan.nextDouble();
		double percentCalFromFat = ((fatGrams*9)/numCalories)*100;
		
		
		System.out.println("Calories that come from fat: %" + percentCalFromFat);
		System.out.println("Total calories in a food item: " + numCalories);

		if(percentCalFromFat<30) {
			System.out.println("The food is low in fat");			
		}else if(percentCalFromFat>=30 && percentCalFromFat<=50) {
			System.out.println("The food is medium fat");
		}else if(percentCalFromFat>50){
			System.out.println("Input is invalid.");
		}
		

	}

}
