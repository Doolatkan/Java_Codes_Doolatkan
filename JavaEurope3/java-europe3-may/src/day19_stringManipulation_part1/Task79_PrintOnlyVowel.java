package day19_stringManipulation_part1;

import java.util.Scanner;

public class Task79_PrintOnlyVowel {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string:");
        String word = scan.nextLine();
        int vowel=0;
               
        for(int i=0; i<word.length(); i++) {        	
        	if(word.charAt(i)== 'A'||word.charAt(i)== 'a'||word.charAt(i)== 'E'||word.charAt(i)== 'e'||word.charAt(i)== 'O'||word.charAt(i)== 'o'||word.charAt(i)== 'I'||word.charAt(i)== 'i'||word.charAt(i)== 'U'||word.charAt(i)== 'u') {
        		vowel++;
        		if(vowel==1) {
        			System.out.print(word.charAt(i));
        		}else{
            		System.out.print("," + word.charAt(i)); 
        		}        			
        	}        		
        }
    }

}
