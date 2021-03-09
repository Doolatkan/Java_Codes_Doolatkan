package day19_stringManipulation_part1;

import java.util.Scanner;

public class Task76_DisplayEachCharacterInTheConsole {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.nextLine();
        
        for(int i = 0; i<word.length(); i++) {
        	System.out.println(word.charAt(i));
        }     
		

	}

}
