package day30_wrapperClass;

public class Task98 {

	public static void main(String[] args) {

		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";		
		String str2 = "N000000i%$!,n!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
		String str3 = "&^4555o66467n&$#e@ ^^n(i4555n66467e&$# @^^e(*)i(g4555h66467t&$# @s^^i(*)(x";

		System.out.println(decodeTheCode(str1));
		System.out.println(decodeTheCode(str2));
		System.out.println(decodeTheCode(str3));
	}
	
	public static String decodeTheCode(String s1) {
		
		String ss1="";		
		
		for(int i=0; i<s1.length(); i++) {
			if(Character.isAlphabetic(s1.charAt(i)) || Character.isSpaceChar(s1.charAt(i))) {
				ss1 = ss1 + s1.charAt(i);
			}
		}		
		
		String[] str1 = ss1.split(" ");
		String newStr="";
		for(String val : str1) {
			newStr = newStr + getDigit(val) + " ";		
	    }
		return newStr;
	}

	public static String getDigit(String st) {
		
		switch(st.toLowerCase()) {
		case "zero":
			return "0";
		case "one":
			return "1";
		case "two":
			return "2";
		case "three":
			return "3";
		case "four":
			return "4";
		case "five":
			return "5";
		case "six":
			return "6";
		case "seven":
			return "7";
		case "eight":
			return "8";
		case "nine":
			return "9";
		default:
			return "";
		}		
	}
}
