package day40_access_modifier_final_2;

import day40_access_modifier_final.Car;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		//c.model = "m3"; //default
		c.year = 2017;
		//c.door = 4; //private
		//c.engine = 5.2; //protected
		
		

	}

}
