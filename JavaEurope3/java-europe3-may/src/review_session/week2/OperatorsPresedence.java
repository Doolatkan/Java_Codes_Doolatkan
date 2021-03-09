package review_session.week2;

public class OperatorsPresedence {
	
	public static void main(String[] args) {
		
		int res = 3*7%3-4-6; 
		//(3 * 7) % 3 - 4 - 6 => 21 % 3 - 4 - 6 => 
		//(21%3) - 4 - 6 => 0 - 4 - 6
		//(0-4) - 6 => -4 - 6 => 
		// - 4 - 6 => -10
		System.out.println(res);
	}

}
