package review_session.week9;

public class PasswordValidation {

	public static void main(String[] args) {
		
		String password = "gdhfgA@5jf";
		System.out.println(isValid(password));
	}
	
	public static String isValid(String str) {
		int ch = 0; 
		int upper = 0;
		int low = 0;
		int digit = 0;
		int special = 0;
		if(str.length()>=6) {
			for(int i=0; i<str.length(); i++) {
				if(Character.isWhitespace(str.charAt(i))){
					ch = -1;	
				}
					
				if(Character.isUpperCase(str.charAt(i))){
					upper++;
				}
				
				if(Character.isLowerCase(str.charAt(i))){
					low++;
				}
				
				if(Character.isDigit(str.charAt(i))){
					digit++;
				}
				if(!Character.isWhitespace(str.charAt(i)) && !Character.isLetterOrDigit(str.charAt(i))) {
					special++;
				}
			}
		}
		
		if(ch==0 && low>0 && upper>0 && digit>0 && special>0 ) {
			return "valid";
		}else {
			return "not valid";
		}
	
	}
}
