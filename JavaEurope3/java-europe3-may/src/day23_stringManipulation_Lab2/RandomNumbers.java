package day23_stringManipulation_Lab2;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());
		
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextFloat());
		
		System.out.println(rn.nextLong());
		
		System.out.println(rn.nextInt(50));
		
		System.out.println(rn.nextGaussian());
		
		System.out.println(rn.nextInt(50)-25);
		
		System.out.println(rn.nextInt(10));
		
		System.out.println(rn.nextInt(10)+5);

	}

}
