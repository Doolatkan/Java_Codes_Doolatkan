package day20_stringManipulation_part2;

public class String_Equals {

	public static void main(String[] args) {
		
		String str1 = "Apple";
		String str2 = "Apple";
		
		System.out.println(str1==str2);//are the same object?
		System.out.println(str1.equals(str2));//are the same value?
		
		String str3 = "Apple";
		String str4 = new String("Apple");
		
		System.out.println(str3==str4);//are the same object?
		System.out.println(str3.equals(str4));
		
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		
		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equals(s3);
		
		System.out.println(b1 + "|" + b2);
		
		boolean b3 = s1==s2;
		boolean b4 = s1==s3;
		
		System.out.println(b3 + "|" + b4);
		
		String s4 = new String("Welcome to Java");
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
		String st1 = "Welcome to Java";
		String st2 = "wElCoMe TO javA";
		System.out.println(st1.equalsIgnoreCase(st2));//it is don't care about capital or small letter 
		
		
		
		
		
		
		
		

	}

}
