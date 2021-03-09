package day43_polimorphizm;

public class InstanceOf {

	public static void main(String[] args) {
		
		Shape sh = new Triangle();
		
		if(sh instanceof Triangle) {
			System.out.println("Triangle Class");
		}else if(sh instanceof Circle) {
			System.out.println("Circle Class");
		}else if(sh instanceof Square) {
			System.out.println("Square Class");
		}
		
		System.out.println(sh instanceof Triangle);

	}

}
