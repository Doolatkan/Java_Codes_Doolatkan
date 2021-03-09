package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter date in next format: MM DD YY");
    int dd = in.nextInt();
    int mm = in.nextInt();
    int yy = in.nextInt();

    if(mm*dd==yy) {
    	System.out.println("date " + mm + "/" + dd + "/" + yy + " is magic");
    }else {
    	System.out.println("date " + mm + "/" + dd + "/" + yy + " is not magic");
    }

	}

}
