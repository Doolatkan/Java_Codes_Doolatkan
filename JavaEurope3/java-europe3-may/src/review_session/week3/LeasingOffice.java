package review_session.week3;

public class LeasingOffice {

	public static void main(String[] args) {


		System.out.println("Welcome to Cybertek apartments!");
		
		int numberBedrooms = 0;
		double startingPrice = 0.0;
		
		switch(numberBedrooms) {
		
		case 0:
			System.out.println("Studio selected");
			startingPrice = 1400.0;
			if(startingPrice>1300.0) {
				System.out.println("Too expensive, BYE");
			}
			break;
		default:
			System.out.println("No such bedroom available");		
		
		
		}
		System.out.println("Starting price:" + startingPrice);
		
//		if(startingPrice>1300.0) {
//			System.out.println("Too expensive, BYE");
//		}

	}

}
