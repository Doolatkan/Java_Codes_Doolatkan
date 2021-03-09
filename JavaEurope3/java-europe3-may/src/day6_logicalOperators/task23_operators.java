package day6_logicalOperators;

public class task23_operators {

	public static void main(String[] args) {


		double db = 20;
		double dd = 80;
		
		double df  = (db + dd) * 25;
		
		
		double dbl = df % 40;
		
		System.out.println(dbl);
		System.out.println("Remaining total is equal to 20 or less? - " + (dbl <= 20));

		
		int x = 2;
		System.out.println(--x);
		
		float a= 100.987_6543f;
		short b = (byte)a;
		byte c = (byte) b;
		
		System.out.println(c);
		
		
	
		
	}

}
