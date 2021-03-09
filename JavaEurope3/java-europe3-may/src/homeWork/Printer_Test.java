package homeWork;

import java.util.Scanner;

public class Printer_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of page:");
		int numPage = scan.nextInt();
		System.out.println("Do you want to print duplix (y - yes, n - no):");
		
		String answer = scan.next();
		boolean duplix = false;
		
		if(answer.equals("y")) {
			duplix = true;
		}
		
		Print p1 = new Print(numPage, duplix);

	}

}
