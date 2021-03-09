package day20_stringManipulation_part2;

import java.util.Scanner;

public class Task80_checkedString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string1:");
		String str1 = scan.nextLine();
		System.out.print("Enter string2:");
		String str2 = scan.nextLine();
		
		checkedString(str1,str2);
	}

	public static void checkedString(String str1, String str2) {


		//if(str1.indexOf(str2)>-1) {
		if(str1.contains(str2)) {
			System.out.println("Position \"" + str2 + "\" in \"" + str1 + "\" is: " + str1.indexOf(str2));
		}else {
			System.out.println("Not found");
		}
		
	}
	
	

}
