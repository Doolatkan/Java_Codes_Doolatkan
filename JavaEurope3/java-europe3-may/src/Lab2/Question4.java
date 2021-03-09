package Lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of males and the females: ");
        int males = sc.nextInt();
        int femailes = sc.nextInt();
        double percentM = males*100/ (males+femailes);
        double percentF = femailes*100/(males+femailes);
        
        System.out.println("Percent of males: " + percentM+"%");
        System.out.println("Percent of females: "  + percentF+"%");
		

	}

}
