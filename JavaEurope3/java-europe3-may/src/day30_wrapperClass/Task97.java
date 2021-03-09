package day30_wrapperClass;

public class Task97 {

	public static void main(String[] args) {
		
		String s= "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(filterString(s));  

	}
	
	public static String filterString(String s) {
		
		 
		String s2 = "";
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
			   s2 = s2 + s.charAt(i);
			}
		}
		return s2;
		
//		String s1 = "";
//		for(int i=0; i<s.length(); i++) {
//			if(Character.isAlphabetic(s.charAt(i))|| Character.isSpaceChar(s.charAt(i))) {
//				s1 = s1 + s.charAt(i);
//			}
//		}
//		return s1;
		
		
	}

}
