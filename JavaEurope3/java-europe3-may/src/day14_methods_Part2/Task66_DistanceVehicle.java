package day14_methods_Part2;

public class Task66_DistanceVehicle {

	public static void main(String[] args) {


		double distaneTravel = distance(40,8);
		System.out.println("Distane is: " + distaneTravel);
		
		if(distaneTravel>500) {
			System.out.println("you spend too much gas");
		}else {
			System.out.println("you spend ok gas");
		}

	}

	public static double distance(double speed, int time) {
        
		double distaneTravel = speed*time;

		
		return distaneTravel;
	}
	
	

}
