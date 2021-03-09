package day20_stringManipulation_part2;

import java.util.Scanner;

public class Task82_LoginFunctionalityLogic {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter UserName:");
		String userName = scan.nextLine();
		System.out.print("Enter Password:");
		String password = scan.nextLine();
		
		String validUserName = "Doolatkan";
		String validPassword = "12345678";
		
		//if(userName.equals("") && password.equals("")) {
		if(userName.length()==0 && password.length()==0) {
			System.out.println("UserName and Password Fields cannot be empty");
		//}else if(userName.equals("") && !password.equals("")) {	
		}else if(userName.length()==0 && password.length()>0) {
			System.out.println("UserName cannot be empty");
		//}else if(!userName.equals("") && password.equals("")) {	
		}else if(userName.length()>0 && password.length()==0) {
			System.out.println("Password cannot be empty");
		//}else if(!userName.equals(validUserName)|| !password.equals(validPassword)) {
			//System.out.println("UserName or Password is not valid. Please verify");
			//System.out.println("User Logged in seccessfully");
		//}else if(userName.equals(validUserName) && password.equals(validPassword)) {
			//System.out.println("User Logged in seccessfully");
		//}			
		}else if(userName.equals(validUserName)&& password.equals(validPassword)) {
			System.out.println("User Logged in seccessfully");
		}else {
			System.out.println("UserName or Password not valid. Please verify");
		}
		
		
		
	}

}
