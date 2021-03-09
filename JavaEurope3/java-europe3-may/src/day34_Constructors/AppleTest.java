package day34_Constructors;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		System.out.println(a1.color);
		changeApple(a1);
		System.out.println(a1.color);
		System.out.println(methodObject().color);

	}
	
	public static void changeApple(Apple apple) {		
		
		apple.color = "White";
		
	}
	
	public static Apple methodObject(){
		Apple app = new Apple();
		app.color = "Green";
		return app;
		
	}

}
