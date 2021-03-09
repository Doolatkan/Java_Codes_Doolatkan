package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class Task88_CarPrice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
				
		String[] autos = new String[7];
		autos[0] = "Honda";
		autos[1] = "Toyota";
		autos[2] = "Nissan";
		autos[3] = "BMW";
		autos[4] = "Mercedes";
		autos[5] = "Porsche";
		autos[6] = "Ferrari";
		
		int carPrice=0;
		System.out.print("Enter an index number to choose your dream car:");
		int indexCar = scan.nextInt();
		
		while(indexCar<1 || indexCar>7) {
			System.out.print("Invalid index. Try it again:");
			indexCar = scan.nextInt();
		}
		
		switch (indexCar) {
		case 1: case 2: case 3: 
			carPrice = rn.nextInt((40_000-20_000)+1)+20_000;
			break;
		case 4: case 5:  
			carPrice = rn.nextInt((80_000-50_000)+1)+50_000;
			break;
		case 6: case 7:  
			carPrice = rn.nextInt((150_000-100_000)+1)+100_000;
			break;
		}
						
		System.out.println("You choosed " + autos[indexCar-1] + ". Car price = $" + carPrice);

	}

}
