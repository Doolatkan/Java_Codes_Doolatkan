package day14_methods_Part2;

import java.util.Scanner;

public class Task69_PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive number:");
		int i = scan.nextInt();		
		
		if(isPrime(i)) {		
		System.out.println("Number " + i + " is prime.");
		}else {
			System.out.println("Number " + i + " is not prime.");
		}		
	}	
	
	public static boolean isPrime(int i){
			
		    if(i>=2) {
				  if((i-1)%2==0 || i==2) {				
				    if(i%3>0 || i==3) {
						if(i%5>0||i==5) {
							if(i%7>0||i==7) {
								return true;
					        }
						}
				    }
		        }
			
		    }
		    return false;		    
	}

}


