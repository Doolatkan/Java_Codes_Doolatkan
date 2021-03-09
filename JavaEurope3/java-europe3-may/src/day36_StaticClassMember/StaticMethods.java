package day36_StaticClassMember;

public class StaticMethods {
	
	static String name = "Apple";
	int age = 10;
	
	public static void show1() {
		//show2();//u cannot call instance method from static method
		show4();
		System.out.println(name);
		//System.out.println(age);//u cannot call instance variable from static method
		
	}
	
	public void show2() {
		
		show1();
		System.out.println(name);
		System.out.println(age);
	}
	
	public void show3() {
		
		show2();
		show1();
		
		
	}
	
	public static void show4() {
		
	}

}
