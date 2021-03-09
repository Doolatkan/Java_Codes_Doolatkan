package day19_stringManipulation_part1;

import java.util.Scanner;

public class Task77_EmajiProgram {

	public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter emoji:");
        String emoji = scan.next();
        
        if(emoji.length()!=2) {
        	System.out.println("Invalid emoji");
        	return; //stop execution
        }
        
        if(emoji.charAt(0)==':') {
        		if(emoji.charAt(1)==')') {
        			System.out.println("Smile");
        		}else if(emoji.charAt(1)=='(') {
        			System.out.println("Sad");
        		}else if(emoji.charAt(1)=='/') {
        			System.out.println("Upset");
        		}else if(emoji.charAt(1)=='p') {
        			System.out.println("Playful");
        		}else {
        			System.out.println("Unknown emoji");
        		}      		
        }else if(emoji.charAt(0)==';') {
        		if(emoji.charAt(1)==')') {
        			System.out.println("Wink");
        		}else if(emoji.charAt(1)=='0') {
        			System.out.println("Surprised");
        		}else {
        			System.out.println("Unknown emoji");
        		}        	
        }else {
        	System.out.println("Invalid");
        }
		

	}

}
