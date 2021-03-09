package day33_ClassObjects_Constructers;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();//it is calling the constructor
		                   //which constructer u want me do execute?
		                   //i want to you execute, constructor which does not have any argument
		
		System.out.println(c1.color);
		
		Car c2= new Car("AMG", "Mercedes", 2007, 65000, "White");
		                 //new - invokes the constructor and creates the object
		                 //which constructor
		                 //go to Car class, and find the constructor which accept 5 parameters
		                 //that are String, String, int, double, String
		
		Car c3 = new Car("Corolla", "Toyota", 2015, 32000, "Yellow");
		Car c4 = new Car("Altima", "Nissan", 2014, 41000, "Black");
		

	}

}
