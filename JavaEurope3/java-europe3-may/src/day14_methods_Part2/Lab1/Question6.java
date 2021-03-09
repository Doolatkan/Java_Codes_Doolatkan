package day14_methods_Part2.Lab1;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of cigars: ");
        int cigar = scan.nextInt();
        System.out.print("Enter true if it is wekend and false otherwise: ");
        boolean isWeeken = scan.nextBoolean();
        
		cigarParty(cigar,isWeeken);

	}

	public static void cigarParty(int cigar, boolean isWeeken) {


		if(!isWeeken) {
			if(cigar>=40 && cigar<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(cigar>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}
	
	

}
