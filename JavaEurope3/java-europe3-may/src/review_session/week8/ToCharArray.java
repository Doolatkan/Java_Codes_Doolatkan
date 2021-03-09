package review_session.week8;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		
		String word = "Java";
		char[] letters = word.toCharArray();
		System.out.println(letters.length);
		System.out.println(Arrays.toString(letters));
		
		String[] str = {"apple", "orange"};
		String h = str[0].substring(2);
		System.out.println(h);
		
		System.out.println(str[0].substring(2));
		
		System.out.println(str[1].substring(1,4));
	}

}
