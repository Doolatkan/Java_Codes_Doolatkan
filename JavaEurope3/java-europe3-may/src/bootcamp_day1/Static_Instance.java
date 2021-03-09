package bootcamp_day1;


	
	class Circle{
		
		
		public double radius; //all circle objects can have different radius
		
		public final static double PI; //all circle objects has same PI
		
		static {
			PI = 3.14;
			/*
			 we can use this block to set static variables even if the variables takes more than 1 step
			 */
		}
		
		public double calculatearea() {
			return PI * radius * radius;
		}
	}
	
	public class Static_Instance {
		
		public static void main(String[]args) {
			Circle circle = new Circle();
			circle.radius = 5;
			
			System.out.println(circle.PI);
			System.out.println(Circle.PI);
			System.out.println(circle.calculatearea());
		}
	}
	
class ClassA{
	
	static int a = 100;
	int b = 200;
	
	static class ClassB{ //inner class
		
		public static void method1() {
			System.out.println(a);
			//System.out.println(b); //static class can have and can access only static members
		}
		
	}
}

class ClassC extends ClassA.ClassB{
	
}

class ClassD{
	
}

	
