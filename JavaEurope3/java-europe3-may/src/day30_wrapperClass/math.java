package day30_wrapperClass;

public class math {

	public static void main(String[] args) {
		
		System.out.println("pow---------------------");
		double result = Math.pow(4.0, 2.0);
		System.out.println(result);
		double result1 = Math.pow(4.0, 3.0);
		System.out.println(result1);
		
		System.out.println("sqrt---------------------");
		double result2 = Math.sqrt(25);
		System.out.println(result2);
		System.out.println("PI--------------------------");
		final double PI = Math.PI;
		System.out.println(PI);
		
		System.out.println("round-----------------------");
		System.out.println(Math.round(4.3));
		System.out.println(Math.round(4.6));
		System.out.println(Math.round(4.5));
		
		System.out.println("floor---------------");
		System.out.println(Math.floor(4.6));
		System.out.println(Math.floor(4.9));
		System.out.println(Math.floor(4.1));
		
		System.out.println("ceil----------------");
		System.out.println(Math.ceil(4.2));
		System.out.println(Math.ceil(4.1));
		System.out.println(Math.ceil(4.002));

	}

}
