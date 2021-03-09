package day26_arrays_part3;

import java.util.Arrays;

public class String_Manipulation_Arrays {

	public static void main(String[] args) {
		
		
		String[] myCars = {"Honda","Mercedes","BMW","Toyota"," Ford "};
		
		for(String val : myCars) {
			System.out.println(val + " = " + val.length() + " letters");
		}
		System.out.println("------------------------------------------");
		System.out.println(myCars[0].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2,3));
		System.out.println(myCars[1].equals(myCars[2]));
		System.out.println(myCars[1]==myCars[2]);
		System.out.println("------------------------------------------");
		
		for(int i=0; i<myCars[0].length();i++) {
			System.out.println(myCars[0].charAt(i));
		}
		
		System.out.println("------------------------------------------");
		
		for(int i=0; i<myCars.length; i++) {
			System.out.println(myCars[i].length());
		}
		
		System.out.println("------------------------------------------");
		
		String str = "I will try study every day programming and english languages to be near to my life of dreame ";
		String[] strNew = str.split(" ");
		System.out.println(strNew.length);
		
		for(String val : strNew) {
			System.out.println(val);
		}
		
		System.out.println(Arrays.toString(strNew));
		System.out.println(strNew[2]);
		System.out.println(strNew[4]);
		
		
		
		
		
		
		
		

	}

}
