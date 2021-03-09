package day13_methods_Part1;

public class CreditCardMethod {

	public static void main(String[] args) {

		double salary  = 50000;
		int creditRating = 7;
		System.out.println("salary: " + salary);
		System.out.println("credit rating: " + creditRating);
		if(salary>=20000 && creditRating>=7) {
			qualify();
		}else {
			noQualify();
		}	

	}

	public static void noQualify() {
		
		System.out.println("I am sorry, youare not qualified for the CC ");
		
	}

	public static void qualify() {
		
		System.out.println("Congrat, you are qualified for the CC ");
		
	}
		
		
}
	




