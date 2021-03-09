package day19_stringManipulation_part1;

import java.util.Scanner;

public class Task78_NumberOfOccurences {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string:");
        String word = scan.nextLine();
        System.out.print("Enter a letter:");
        String letter = scan.nextLine();
        int numOccurences = 0;
        
        if(letter.length()!=1) {
        	System.out.println("Invalid letter");
        	return;
        }
        
        for(int i=0; i<word.length();i++) {
        
        if(letter.charAt(0)==word.charAt(i)) {
        	numOccurences++;        	
        }        
        }
        System.out.println("Number of \"" + letter + "\" in this string is:" + numOccurences);	

	}

}
