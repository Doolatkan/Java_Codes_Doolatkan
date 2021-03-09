package day43_polimorphizm;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		Animal dog = new Dog();
		
		Animal bird = new Bird();
		
		//Bird b2 = new Animal(); //error
		
		animal = new Cat();
		

	}

}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}

class Cat extends Animal{}

