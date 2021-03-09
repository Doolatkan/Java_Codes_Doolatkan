package review_session.week4;

import java.util.Scanner;

public class printNumberdivisibleBy7 {

	public static void main(String[] args) {


//		int start = 3;
//		int end = 245;
//		int counter=0;
//		for(int i = start; i<=end; i++) {
//			if(i%7==0) {
//				counter++;
//				System.out.print(i+", ");
//			}
//		}
//		System.out.println("\n"+counter);

		
		
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter start number:");
	int start = scan.nextInt();
	System.out.print("Enter end number:");
	int end = scan.nextInt();
	System.out.print("Enter number should be divisible by:");
	int div = scan.nextInt();
	System.out.print("You wanna see odd or even number? If odd put 0, if even put 1:");
	int oddEven = scan.nextInt();
		int sum =0;
		for(int i=start; i<=end; i++) {
			
			if(i%div==0) {
				sum=sum+i;
				System.out.print(i+", ");
			
		
		
		if(oddEven==0) {
			
			if(i%2!=0) {
				System.out.print(i+", ");	
				}
		} else {
			
			
		if(i%2==0) {
					
				    System.out.print(i+", ");
				}
		
			}
			}
		}
		System.out.println("\nSum:" + sum);
		
		}
}

	
	

