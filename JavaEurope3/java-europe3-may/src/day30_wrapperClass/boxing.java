package day30_wrapperClass;

public class boxing {

	public static void main(String[] args) {
		
		//AUTOBOXING -> primitive to object
		
		Integer num1 = 1234;
		int n= 5;
		Integer num2  = n;
		
		//AUTOBOXING -> object to primitive	
		
		Double d1 = new Double(34.2);
		double d2 = d1;
		
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		
		long l1 = new Long(60000000L); //unboxing
		Long l2 = new Long(3456999459L);//no boxing
		
		long l3 = l2;// unboxing;
		Long l4 = l3; // boxing;
		
		int x = 345;
		double y = x;
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3; // casting not possible with wrapper classes
		//System.out.println(d3);

		

	}

}
