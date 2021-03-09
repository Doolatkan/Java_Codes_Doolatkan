package day23_stringManipulation_Lab2;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string:");
		String str = scan.nextLine();
		System.out.println(catDog(str));

	}

	public static boolean catDog(String str) {
		int countCat=0;
		int countDog=0;
		for(int i = 0; i<str.length()-2;i++) {
			if(str.substring(i,i+3).equalsIgnoreCase("cat")) {
				countCat++;
			}
			if(str.substring(i,i+3).equalsIgnoreCase("dog")) {
				countDog++;
			}
		}
		
		if(countCat==countDog) {
			System.out.print(countCat + "cats" + " = " + countDog + "dogs" + " -> ");
			return true;
		}else {
			System.out.print(countCat + "cats" + " = " + countDog + "dogs" + " -> ");
			return false;
		}
		
	}
	
	

}
