package assignments.Assignment_6NestedForLoop;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = scan.nextInt();
		int k=num;
		for(int i=1; i<=num; i++) {
			int temp = i;
			for(int j=1;j<=i;j++) {
				if(j>1) {
					temp = temp+(num+1-j);
					System.out.print(" " + temp);											
					}else {
						System.out.print(i);
					}
			     
			}
			
				System.out.println();
				
		}

			}  
	           
		}



	


