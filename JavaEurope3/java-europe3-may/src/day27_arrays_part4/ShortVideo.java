package day27_arrays_part4;

import java.util.Arrays;



public class ShortVideo {

	public static void main(String[] args) {
		
		int[] numbers = {2,5,3};
		
		String[] names = {"John","Adam","Don"};
		
		Person p1 = new Person();
		p1.name="Adam";
		p1.age = 28;
		
		Person p2 = new Person();
		p2.name="Adam";
		p2.age = 28;
		
		Person p3 = new Person();
		p3.name="Adam";
		p3.age = 28;
		
		Person[]people = {p1,p2,p3};
		
		for(int i=0; i<people.length; i++) {
			System.out.println(people[i]);
		}
		
		
		

	}

}
