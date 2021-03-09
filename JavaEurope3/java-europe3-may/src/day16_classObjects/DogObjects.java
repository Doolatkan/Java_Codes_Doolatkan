package day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {

        Dog dog1 = new Dog();        
        Dog dog2 = new Dog();        
        Dog dog3 = new Dog();
        
        dog1.name = "Aktosh";
        dog1.age=10;
        dog1.color="Red";
        dog1.breed = "Maltese";        
        
        System.out.println("name: "+dog1.name);
        System.out.println("age: "+dog1.age);
        System.out.println("color: "+dog1.color);
        System.out.println("breed: "+dog1.breed);
     
        dog1.barking();
        dog1.hungry();
        dog1.sleeping();
        System.out.println();
		
        
        dog2.name = "Linda";
        dog2.age=5;
        dog2.color="Black";
        dog2.breed = "Hezka";        
        
        System.out.println("name: "+dog2.name);
        System.out.println("age: "+dog2.age);
        System.out.println("color: "+dog2.color);
        System.out.println("breed: "+dog2.breed);
     
        dog2.barking();
        dog2.hungry();
        dog2.sleeping();
        
        System.out.println();
        
        
        dog3.name = "Akjoltoi";
        dog3.age=30;
        dog3.color="Brown";
        dog3.breed = "Alabai";        
        
        System.out.println("name: " + dog3.name );
        System.out.println("age: "+dog3.age);
        System.out.println("color: "+dog3.color);
        System.out.println("breed: "+dog3.breed);
     
        dog3.barking();
        dog3.hungry();
        dog3.sleeping();

	}

}
