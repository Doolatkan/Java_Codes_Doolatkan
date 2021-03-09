package bootcamp_day1;

public class MethodsPractice {

	public static void main(String[] args) {
		
		String str1 = "Doolatkan";
		System.out.println(reverseStr(str1));
		
		String word = "Mehmet";
		String reversedWord = reverseStr(word);
		boolean isPalendrome = word.equals(reversedWord);
		System.out.println("Is Palindrome: " + isPalendrome);
		System.out.println("Is Palindrome: " + isPalindrome(word));

	}

	public static String reverseStr(String str) {
		String result = "";
		for(int i=str.length()-1; i>=0; i--) {
			result = result + str.charAt(i);
		}
		
		return result;
	}
	
	public static boolean isPalindrome(String word) {
		return reverseStr(word).equals(word);
	}
	
	public static void method() {
		
	}
	
	private static int method(int a) {
		return a;
	}
	
	private static int method(int a, int b) {
		return a;
	}
}
