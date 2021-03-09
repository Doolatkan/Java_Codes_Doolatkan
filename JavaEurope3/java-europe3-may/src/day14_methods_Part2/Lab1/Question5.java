package day14_methods_Part2.Lab1;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a speed: ");
        int speed = scan.nextInt();
        System.out.print("Is today your birhtad. Enter true if yes and false otherwise: ");
        boolean isBirthday = scan.nextBoolean();
        
        caughtSpeeding(speed,isBirthday);
		

	}

	public static void caughtSpeeding(int speed, boolean isBirthday) {


		if(!isBirthday) {
			
			if(speed>=0 && speed<=60) {
				System.out.println("0 = no ticket");
			}else if(speed>60&&speed<=80) {
				System.out.println("1 = small ticket");
			}else if(speed>80) {
				System.out.println("2 = big ticket");
			}else {
				System.err.println("Invalid input");
			}
			
		}else {
			if(speed>=0 && speed<=65) {
				System.out.println("0 = no ticket");
			}else if(speed>65&&speed<=85) {
				System.out.println("1 = small ticket");
			}else if(speed>85) {
				System.out.println("2 = big ticket");
			}else {
				System.err.println("Invalid input");
			}
			
		}
		
	}
	
	

	
	
	

}
