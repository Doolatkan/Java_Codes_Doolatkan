package day19_stringManipulation_part1;

import java.util.Scanner;

public class Task75_TotalCharacters {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your firstname and lastname:");
        String firstname = scan.next();
        String lastname = scan.next();
        
        System.out.println("Total characters in your first and last name is: "  + (firstname.length()+ lastname.length()));		

	}

}
