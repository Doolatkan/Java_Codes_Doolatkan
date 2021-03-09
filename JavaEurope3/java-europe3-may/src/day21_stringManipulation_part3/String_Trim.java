package day21_stringManipulation_part3;

public class String_Trim {

	public static void main(String[] args) {
		
		String str = "          Programming is fun";
		System.out.println(str.trim());
		
		
		String str1 = "          Programming      is fun";
		System.out.println(str1.trim());
		
		
		String str2 = "          Program       ming is         fun         ";
		System.out.println(str2.trim());
		
		
		String str4 = "          Pro    gramm   ing is fun                           ";
		System.out.println(str4.trim());
		
		

	}

}
