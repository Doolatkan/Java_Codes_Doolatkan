package day26_arrays_part3;

import java.util.Scanner;

public class MethodArray2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of car:");
		int carSize = scan.nextInt();
		
		while(carSize<0) {
			System.out.print("Size of car can not be negative number. Try it again:");
			carSize = scan.nextInt();
		}
		
		String[] cars = createCars(carSize);
		scan.nextLine();
		  System.out.print("Enter car model which is you looking:");		  
			String carModel = scan.nextLine();
			while(carModel.isBlank()) {
				System.out.print("Line car model cannot be empty space. Try it again:");
				carModel = scan.nextLine();
			}
			
			System.out.println(findCar(cars, carModel));

	}

	public static String[] createCars(int carSize) {
		
		Scanner scan = new Scanner(System.in);
        String[] cars = new String[carSize];
		
        for(int i=0; i<cars.length; i++) {
        	System.out.print("Enter " + (i+1) + "-car model:");
    		cars[i] = scan.nextLine();    		
    		while(cars[i].isBlank()) {
    			System.out.print("Invalid car model.Try it again:");
    			cars[i] = scan.nextLine();
    		}
    		 
        }
        
        return cars;           
	}
	
	
	public static boolean findCar(String[] cars, String carModel) {
		
		for(String model : cars) {
			if(model.equalsIgnoreCase(carModel)) {
				return true;
				
			}	
		}		
		
		return false;
	}

}
