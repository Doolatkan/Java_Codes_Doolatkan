package day38_Inheritance_part2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog(2, 4, 1, 20, "Long Silky");
		
		//print name
		System.out.println(dog1.getName());
		dog1.chew();
		dog1.eat();
		dog1.move(150);

	}

}
