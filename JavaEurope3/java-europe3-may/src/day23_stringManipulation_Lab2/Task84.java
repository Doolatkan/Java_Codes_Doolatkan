package day23_stringManipulation_Lab2;

import java.util.*;

public class Task84 {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		Random rn = new Random();
		
		for(int i=0; i<10;i++) {
		 
			if(rn.nextBoolean()) {
				System.out.println("Heads");
			}else {
				System.out.println("Tails");
			}
		}

	}

}
