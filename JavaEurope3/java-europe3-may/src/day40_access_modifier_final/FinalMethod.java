package day40_access_modifier_final;

public final class FinalMethod {
	
	String x= "apple"; //String class also final. we cannot extends
	
	public  final void method1() {
		System.out.println("Method-1");
	}
	
	public final static void staticMethod(String word) {
		System.out.println("Static Method");
	}

	
	 
}

/*
class Sub extends FinalMethod{  //WE CANNOT EXTEND FINAL CALSS 	

	
	public void method1() {
		System.out.println("Method-1 in subclass");
	}                                                   //WE CANNOT OVERRIDE FINAL METHOD
	
	public static void staticMethod(String word) {
		System.out.println("Static Method in Sub Class");
	}
}
*/
	

	

