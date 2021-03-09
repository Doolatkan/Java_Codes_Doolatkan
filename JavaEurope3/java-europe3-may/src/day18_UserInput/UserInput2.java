package day18_UserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a sentence and I will repeat it:");
        //String str = scan.next();
        String str2 = scan.nextLine();
        //System.out.println(str);
        System.out.println(str2);

	}

}
