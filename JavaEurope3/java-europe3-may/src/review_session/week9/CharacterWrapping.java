package review_session.week9;

public class CharacterWrapping {

	public static void main(String[] args) {
		
		char ch1 = 'a';
		System.out.println(Character.isLetter(ch1));
		System.out.println(Character.isDigit(ch1));
		System.out.println(Character.isLowerCase(ch1));
		System.out.println(Character.isAlphabetic(ch1));
		System.out.println("---------------------------------");
		char ch2 = '5';
		System.out.println(Character.isDigit(ch2));
		System.out.println(Character.isLetter(ch2));
		System.out.println(Character.isLetterOrDigit(ch2));
		
		char ch4 = ' ';
		System.out.println(Character.isWhitespace(ch4));
		System.out.println(Character.isSpaceChar(ch4));

	}

}
